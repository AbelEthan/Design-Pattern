package com.aen.factory.simple.pizza;

/**
 * Title: {@link Pizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 14:15
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，不同的披萨材料不一样
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
