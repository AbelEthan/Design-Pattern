package com.aen.principle.inversion.case2;


/**
 * Title: {@link WeChat}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:26
 */
public class WeChat implements IReceiver {
    @Override
    public String getInfo(){
        return "微信信息：hello,world";
    }
}
