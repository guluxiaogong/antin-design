package com.antin.design.builder;

/**
 * Created by Administrator on 2017/9/2.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
