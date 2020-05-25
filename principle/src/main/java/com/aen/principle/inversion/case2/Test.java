package com.aen.principle.inversion.case2;

/**
 * Title: {@link Test}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:28
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new QQ());
        person.receive(new WeChat());
    }
}
