package com.aen.principle.ocp.case2;


/**
 * Title: {@link Triangle}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:18
 */
public class Triangle extends Shape{
    public Triangle(){
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
