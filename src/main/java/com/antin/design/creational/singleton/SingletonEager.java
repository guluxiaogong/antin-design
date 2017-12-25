package com.antin.design.creational.singleton;

/**
 * Created by Administrator on 2017/9/2.
 * 单例模式（Singleton）
 * <p>
 * 饿汉式
 */
public class SingletonEager {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonEager instance = new SingletonEager();


    /* 私有构造方法，防止被实例化 */
    private SingletonEager() {}

    /* 静态工程方法，创建实例 */
    public static SingletonEager getInstance() {
        return instance;
    }

}
