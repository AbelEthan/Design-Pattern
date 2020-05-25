package com.aen.factory.method.order;


import com.aen.factory.method.pizza.BjCheesePizza;
import com.aen.factory.method.pizza.BjPepperPizza;
import com.aen.factory.method.pizza.Pizza;

/**
 * Title: {@link BjOrderPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:21
 */
public class BjOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BjCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
