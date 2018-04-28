package com.zhourf.dagger.daggerexample.example11;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 定义一个注解，并标注@Qualifier,这里定义的是标注parrot来源的注解
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ParrotQualifier {
}
