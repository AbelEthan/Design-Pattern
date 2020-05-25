package com.aen.singleton.type8;


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
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("枚举");
        System.out.println(instance.equals(instance1));
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance1: " + instance1.hashCode());
    }
}

