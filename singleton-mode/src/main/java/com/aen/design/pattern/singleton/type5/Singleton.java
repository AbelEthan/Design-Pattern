package com.aen.design.pattern.singleton.type5;

/**
 * Title: {@link Singleton}
 * Description: 这种写法本意是想对第四种实现方式的改进，因为同步方法效率太低，改成同步产生实例的代码块
 * 但是这种同步方式不能起到线程安全
 * 实际开发中不能使用这张方式
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:38
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
