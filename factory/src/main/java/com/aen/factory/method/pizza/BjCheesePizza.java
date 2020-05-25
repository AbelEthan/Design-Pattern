package com.aen.factory.method.pizza;

/**
 * Title: {@link BjCheesePizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:19
 */
public class BjCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("给北京奶酪披萨 准备原材料");
    }
}
