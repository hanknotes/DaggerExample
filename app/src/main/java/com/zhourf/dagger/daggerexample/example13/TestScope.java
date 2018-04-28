package com.zhourf.dagger.daggerexample.example13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface TestScope {
}
