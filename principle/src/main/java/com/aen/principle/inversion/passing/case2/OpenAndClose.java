package com.aen.principle.inversion.passing.case2;

/**
 * Title: {@link OpenAndClose}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:44
 */
public class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        this.itv.play();
    }
}
