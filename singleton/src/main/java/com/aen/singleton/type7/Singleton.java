package com.aen.singleton.type7;

/**
 * Title: {@link Singleton}
 * Description: 这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 * 类的静态属性只会在第一次加载的时候初始化，JVM保证了线程安全
 * 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率比较高。推荐使用
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:38
 */
public class Singleton {

    private Singleton(){
    }

    private static class SingleInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingleInstance.INSTANCE;
    }


}
