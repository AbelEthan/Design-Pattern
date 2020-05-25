package com.aen.principle.inversion.passing.case3;

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

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.itv = tv;
    }
}
