package com.aen.principle.ocp.case2;


/**
 * Title: {@link Rectangle}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:16
 */
public class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
