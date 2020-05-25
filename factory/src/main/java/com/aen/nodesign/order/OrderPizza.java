package com.aen.nodesign.order;

import com.aen.nodesign.pizza.CheesePizza;
import com.aen.nodesign.pizza.GreekPizza;
import com.aen.nodesign.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title: {@link OrderPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:21
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
