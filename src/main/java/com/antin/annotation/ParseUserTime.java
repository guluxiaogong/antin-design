package com.antin.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by jichangjin on 2017/9/22.
 */
public class ParseUserTime {



    public static void parseAnnotation() throws Exception {
        Class<?> clazz = Class.forName("com.zoe.recom.util.annotation.Apple");

        Method method = clazz.getDeclaredMethod("testApple", String.class);

        Parameter[] parameters = method.getParameters();

        UseTimeAnotation useTimeAnotation = method.getAnnotation(UseTimeAnotation.class);

        System.out.println(useTimeAnotation.name() + System.currentTimeMillis());
        method.invoke(clazz.newInstance(), "bbbbbbbbbb");
        // 得到注解的俩参数
        System.out.println(useTimeAnotation.name() + System.currentTimeMillis());

    }

    //
    public static void main(String[] args) throws Exception {
        //getFruitInfo("com.zoe.recom.util.annotation.");//bean
        //parseAnnotation();
        Apple apple = new Apple();

        apple.testApple("ccccccc");
    }
}
