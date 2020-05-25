package com.aen.factory.abs.order;


import com.aen.factory.abs.pizza.Pizza;

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

    private AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;

        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
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
