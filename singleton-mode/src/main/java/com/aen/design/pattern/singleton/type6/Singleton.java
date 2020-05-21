package com.aen.design.pattern.singleton.type6;

/**
 * Title: {@link Singleton}
 * Description: 不仅解决的懒加载还解决了线程安全问题，推荐使用这种方式
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:38
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
