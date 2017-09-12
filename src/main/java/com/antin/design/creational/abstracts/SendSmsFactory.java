package com.antin.design.creational.abstracts;

/**
 * Created by Administrator on 2017/9/2.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
