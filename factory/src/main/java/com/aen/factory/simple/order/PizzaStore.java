package com.aen.factory.simple.order;

/**
 * Title: {@link PizzaStore}
 * Description: 优点是比较好理解，简单易操作
 * 缺点是违反了ocp原则，加新功能的时候，尽量不修改代码，或者尽可能少修改代码。
 * 添加披萨种类就会修改代码比较繁琐
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:27
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new SimpleFactory());
        new OrderPizza2();
        System.out.println("退出");
    }
}
