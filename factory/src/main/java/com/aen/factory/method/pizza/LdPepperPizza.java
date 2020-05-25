package com.aen.factory.method.pizza;

/**
 * Title: {@link LdPepperPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:45
 */
public class LdPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("给伦敦胡椒披萨 准备原材料");
    }
}
