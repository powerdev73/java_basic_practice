package powerdev.devstudy.domain.userinfo.dao;

import powerdev.devstudy.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
