package com.aen.principle.liskov.case2;

/**
 * Title: {@link A}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 17:52
 */
public class A extends Base{

    public int func1(int num1, int num2){
        return num1 - num2;
    }
}
