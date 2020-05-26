package com.aen.principle.ocp.case2;


/**
 * Title: {@link Circle}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:18
 */
public class Circle extends Shape{
    public Circle(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
