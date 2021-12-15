package powerdev.devstudy.domain.userinfo.dao.mysql;

import powerdev.devstudy.domain.userinfo.UserInfo;
import powerdev.devstudy.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userID = " + userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = " + userInfo.getUserID());
    }
}
