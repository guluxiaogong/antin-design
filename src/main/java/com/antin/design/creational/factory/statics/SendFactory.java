package com.antin.design.creational.factory.statics;

/**
 * Created by Administrator on 2017/9/2.
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
