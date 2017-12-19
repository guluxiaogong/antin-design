package com.antin.design.creational.singleton;

/**
 * Created by Administrator on 2017/9/2.
 * 单例模式（Singleton）
 * <p>
 * 懒汉式
 */
public class SingletonLazy {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazy instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy() {}

    /* 静态工程方法，创建实例 */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
