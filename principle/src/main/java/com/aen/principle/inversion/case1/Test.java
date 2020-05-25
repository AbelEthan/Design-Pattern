package com.aen.principle.inversion.case1;

/**
 * Title: {@link Test}
 * Description: 完成了邮件的发送，比较简单
 * 假如我们需要发送微信，QQ，短信等等，是不是就要新增类而且还要在person类里面添加对应的方法
 * 解决：引入一个抽象接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:28
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
