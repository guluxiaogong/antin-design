package com.antin.design.abstracts;

/**
 * Created by Administrator on 2017/9/2.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
