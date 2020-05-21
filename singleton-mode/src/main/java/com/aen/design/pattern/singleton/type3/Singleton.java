package com.aen.design.pattern.singleton.type3;

/**
 * Title: {@link Singleton}
 * Description: 优点：起到了懒加载的效果，单只能在单线程下使用
 * 缺点：在多线程下会产生多个实例。
 * 实际开发中不要使用这种方式
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:25
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
