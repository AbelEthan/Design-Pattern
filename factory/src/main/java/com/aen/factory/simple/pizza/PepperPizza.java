package com.aen.factory.simple.pizza;

/**
 * Title: {@link PepperPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:45
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给胡椒披萨 准备原材料");
    }
}
