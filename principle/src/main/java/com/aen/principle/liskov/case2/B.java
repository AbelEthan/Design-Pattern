package com.aen.principle.liskov.case2;

/**
 * Title: {@link B}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 17:52
 */
public class B extends Base {

    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) + 9;
    }

    public int func3(int a, int b){
        return this.a.func1(a, b);
    }
}
