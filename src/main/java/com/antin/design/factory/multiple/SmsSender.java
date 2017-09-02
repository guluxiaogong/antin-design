package com.antin.design.factory.multiple;

/**
 * Created by Administrator on 2017/9/2.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
