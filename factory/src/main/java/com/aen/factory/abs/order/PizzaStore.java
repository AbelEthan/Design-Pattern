package com.aen.factory.abs.order;

/**
 * Title: {@link PizzaStore}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:27
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BjFactory());
        new OrderPizza(new LdFactory());
        System.out.println("退出");
    }
}
