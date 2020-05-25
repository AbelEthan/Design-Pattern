package com.aen.principle.single.case1;


/**
 * Title: {@link IUserInfo}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 15:16
 */
public interface IUserInfo {

    void setUserID(String userId);

    void setPassword(String password);

    void setUserName(String userName);

    boolean changePassword(String oldPassword);

    boolean deleteUser();

    boolean addRole(int roleId);
}
