package com.aen.factory.simple.order;


import com.aen.factory.simple.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title: {@link OrderPizza2}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:21
 */
public class OrderPizza2 {
    private Pizza pizza = null;
    private String orderType = "";
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String s = reader.readLine();
            return s;
        } catch (IOException e) {
            e.getStackTrace();
            return "";
        }
    }
}
