package com.aen.principle.ocp.case1;

/**
 * Title: {@link Test}
 * Description: 优点是比较好理解，简单易操作
 * 缺点是违反了设计模式的ocp原则
 * 比如我们这个时候要新增一个图形种类，我们需要添加类，添加方法，添加判断代码
 *
 * 改进：把Shape做成抽象类，并提供一个抽象的draw方法，让子类去实现即可，
 * 这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可。
 * 使用方的代码就不需要修改=》满足了开闭原则
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:21
 */
public class Test {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
