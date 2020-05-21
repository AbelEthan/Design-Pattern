package com.aen.design.pattern.singleton.type4;

/**
 * Title: {@link Singleton}
 * Description: 优点：解决了线程不安全的问题
 * 缺点：效率太低了，每个线程在获得类的实例时候，执行静态方法都要同步。
 * 而其实这个方法执行一次实例化代码就够了，后面的想获取类的实例，
 * 直接返回就好了。方法进行同步效率太低
 * 实际开发中不使用这种方式
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:30
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
