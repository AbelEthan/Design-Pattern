package com.aen.singleton.type6;

/**
 * Title: {@link Singleton}
 * Description: 线程安全，延迟加载，效率高
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
