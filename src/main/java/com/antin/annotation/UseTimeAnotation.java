package com.antin.annotation;

import java.lang.annotation.*;

/**
 * Created by jichangjin on 2017/9/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UseTimeAnotation {
     String name() default "";

}
