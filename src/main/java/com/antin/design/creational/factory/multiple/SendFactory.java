package com.antin.design.creational.factory.multiple;


/**
 * Created by Administrator on 2017/9/2.
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
