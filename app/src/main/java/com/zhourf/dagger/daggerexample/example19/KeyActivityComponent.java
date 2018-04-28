package com.zhourf.dagger.daggerexample.example19;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = TestModule.class)
public interface KeyActivityComponent {
    void inject(KeyActivity activity);
}
