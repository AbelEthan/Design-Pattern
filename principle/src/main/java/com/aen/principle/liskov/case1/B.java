package com.aen.principle.liskov.case1;

/**
 * Title: {@link B}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 17:52
 */
public class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
}
