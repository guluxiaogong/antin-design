package com.antin.annotation;

/**
 * Created by jichangjin on 2017/9/22.
 */
public class Apple {

    @UseTimeAnotation(name = "aaaaaaaaaaa")
    public void testApple(String name) throws InterruptedException {
        Thread.sleep(1000L);
        System.out.println("==================================>"+name);
    }
}
