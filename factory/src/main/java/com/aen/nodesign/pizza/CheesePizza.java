package com.aen.nodesign.pizza;

/**
 * Title: {@link CheesePizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:19
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制造奶酪准备原材料");
    }
}
