package com.aen.factory.simple.pizza;

/**
 * Title: {@link GreekPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:20
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨 准备原材料");
    }
}
