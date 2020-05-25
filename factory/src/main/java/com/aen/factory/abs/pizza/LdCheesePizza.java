package com.aen.factory.abs.pizza;

/**
 * Title: {@link com.aen.factory.method.pizza.LdCheesePizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:19
 */
public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("给伦敦奶酪披萨 准备原材料");
    }
}
