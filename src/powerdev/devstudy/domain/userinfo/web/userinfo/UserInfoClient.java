package powerdev.devstudy.domain.userinfo.web.userinfo;

import powerdev.devstudy.domain.userinfo.UserInfo;
import powerdev.devstudy.domain.userinfo.dao.UserInfoDao;
import powerdev.devstudy.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import powerdev.devstudy.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("db.properties");
//
//        Properties prop = new Properties();
//        prop.load(fis);
//
//        String dbType = prop.getProperty("DBTYPE");

        String dbType = "ORACLE";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("12345");
        userInfo.setPassword("!@#$$%");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        } else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("DB ERROR");
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
