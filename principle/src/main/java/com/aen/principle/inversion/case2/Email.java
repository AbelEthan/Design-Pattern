package com.aen.principle.inversion.case2;


/**
 * Title: {@link Email}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/25 16:26
 */
public class Email implements IReceiver {
    @Override
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}
