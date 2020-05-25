package com.aen.principle.inversion.passing.case1;

/**
 * Title: {@link OpenAndClose}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:44
 */
public class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
