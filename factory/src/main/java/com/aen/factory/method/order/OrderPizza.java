package com.aen.factory.method.order;


import com.aen.factory.method.pizza.Pizza;

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
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

    public abstract Pizza createPizza(String orderType);

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
