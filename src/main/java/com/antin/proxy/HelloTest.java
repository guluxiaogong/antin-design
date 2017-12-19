package com.antin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jichangjin on 2017/9/22.
 */
public class HelloTest {
    public static void main(String[] args) throws Exception {
        HelloTest helloTest = new HelloTest();
        helloTest.testProxy();

    }

    public void testProxy() throws Exception {
        final IHello hello = new Hello();

        /*
         * proxyHello    : 代理主题角色，代理类的实例
         * IHello        : 抽象主题角色，代理类和被代理类都需要实现的接口，JDK中的动态代理必须针对接口
         * hello         : 真实主题角色，被代理类的实例
         */
        IHello proxyHello = (IHello) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{IHello.class}, new InvocationHandler() {

                    /*
                     * @param proxy : 当前代理类的一个实例； 若在invoke()方法中调用proxy的非final方法，将造成无限循环调用.
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // 前置的业务逻辑操作
                        System.out.println("---开始");

                        // 调用被代理类的方法，传入参数args，得到返回
                        Object object = method.invoke(hello, args);

                        // 后置的业务逻辑操作
                        System.out.println("---结束");

                        return object;
                    }
                });

        proxyHello.hello();
    }
}
