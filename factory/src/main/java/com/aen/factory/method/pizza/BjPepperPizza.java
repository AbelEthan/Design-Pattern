package com.aen.factory.method.pizza;

/**
 * Title: {@link BjPepperPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:45
 */
public class BjPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("给北京胡椒披萨 准备原材料");
    }
}
