package com.zhourf.dagger.daggerexample.example12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Scope只能标注在注解上
 * 这里自定义一个Scope
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScope {
}
