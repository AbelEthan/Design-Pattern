package com.aen.factory.method.order;


import com.aen.factory.method.pizza.LdCheesePizza;
import com.aen.factory.method.pizza.LdPepperPizza;
import com.aen.factory.method.pizza.Pizza;

/**
 * Title: {@link LdOrderPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:21
 */
public class LdOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LdCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
