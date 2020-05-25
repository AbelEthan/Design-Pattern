package com.aen.factory.abs.order;

import com.aen.factory.abs.pizza.BjCheesePizza;
import com.aen.factory.abs.pizza.BjPepperPizza;
import com.aen.factory.abs.pizza.Pizza;

/**
 * Title: {@link BjFactory}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 16:57
 */
public class BjFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BjCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BjPepperPizza();
        }
        return pizza;
    }


}
