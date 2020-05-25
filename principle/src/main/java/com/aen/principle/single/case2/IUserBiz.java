package com.aen.principle.single.case2;


/**
 * Title: {@link IUserBiz}
 * Description: 负责用户的行为
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 15:16
 */
public interface IUserBiz {

    boolean changePassword(String oldPassword);

    boolean deleteUser();

    boolean addRole(int roleId);
}
