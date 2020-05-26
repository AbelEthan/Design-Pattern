package com.aen.principle.ocp.case2;


/**
 * Title: {@link OtherGraphic}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:18
 */
public class OtherGraphic extends Shape{
    public OtherGraphic(){
        super.type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
