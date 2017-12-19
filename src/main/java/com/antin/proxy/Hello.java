package com.antin.proxy;

/**
 * Created by jichangjin on 2017/9/22.
 */
public class Hello implements IHello{
    @Override
    public void hello() {
        System.out.println("我是Hello.");
    }
}
