package com.aen.singleton.type2;

/**
 * Title: {@link Test}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 10:16
 */
public class Test {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("饿汉式---静态代码块");
        System.out.println(instance.equals(instance1));
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance1: " + instance1.hashCode());
    }
}

