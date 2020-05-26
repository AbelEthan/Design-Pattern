package com.aen.principle.ocp.case1;

/**
 * Title: {@link GraphicEditor}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:14
 */
public class GraphicEditor {

    private void drawCircle(){
        System.out.println("绘制圆形");
    }

    private void drawRectangle(){
        System.out.println("绘制矩形");
    }

    private void drawTriangle(){
        System.out.println("绘制三角形");
    }

    public void drawShape(Shape shape){
        if (shape.type == 1){
            drawRectangle();
        }else if (shape.type == 2){
            drawCircle();
        }else if (shape.type == 3){
            drawTriangle();
        }
    }
}
