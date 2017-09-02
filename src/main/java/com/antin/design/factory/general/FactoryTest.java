package com.antin.design.factory.general;

/**
 * Created by Administrator on 2017/9/2.
 * 【工厂方法模式（Factory Method）】
 * <p>
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
