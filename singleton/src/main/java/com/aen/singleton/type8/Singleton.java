package com.aen.singleton.type8;

/**
 * Title: {@link Singleton}
 * Description: 这借助JDK1.5中添加的枚举来实现单例模式。不仅避免了多线程同步问题，还防止 反序列化重新创建新的对象;
 * 这种方式是Effective Java作者Josh Bloch提倡的方式。推荐使用
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 11:04
 */
public enum  Singleton {
    INSTANCE
}
