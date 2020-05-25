package com.aen.principle.inversion.case2;


/**
 * Title: {@link QQ}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:26
 */
public class QQ implements IReceiver {
    @Override
    public String getInfo(){
        return "QQ信息：hello,world";
    }
}
