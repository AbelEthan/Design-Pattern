package com.aen.factory.abs.order;

import com.aen.factory.abs.pizza.*;

/**
 * Title: {@link LdFactory}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 16:57
 */
public class LdFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LdCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }


}
