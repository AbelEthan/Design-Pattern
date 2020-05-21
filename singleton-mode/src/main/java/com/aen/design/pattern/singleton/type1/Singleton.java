package com.aen.design.pattern.singleton.type1;

/**
 * Title: {@link Singleton}
 * Description: 优点：写法简单，在类装载时完成实例，避免的线程同步问题
 * 缺点：在类装载时完成实例，没有达到懒加载的效果。如果始终没有使用这个实例，则会造成内存的浪费
 *
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:19
 */
public class Singleton{

    private Singleton(){
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
