package com.aen.principle.inversion.passing.case1;

/**
 * Title: {@link ChangHong}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:43
 */
public class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机打开");
    }
}
