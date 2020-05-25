package com.aen.principle.single.case2;

/**
 * Title: {@link UserInfo}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 15:27
 */
public class UserInfo implements IUserInfo {
    @Override
    public void setUserID(String userId) {

    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public boolean changePassword(String oldPassword) {
        return false;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public boolean addRole(int roleId) {
        return false;
    }
}
