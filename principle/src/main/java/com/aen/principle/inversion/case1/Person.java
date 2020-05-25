package com.aen.principle.inversion.case1;

/**
 * Title: {@link Person}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:27
 */
public class Person {

    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
