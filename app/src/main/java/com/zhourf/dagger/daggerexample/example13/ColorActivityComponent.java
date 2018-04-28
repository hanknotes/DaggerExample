package com.zhourf.dagger.daggerexample.example13;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@TestScope
@Component(modules = TestModule.class)
public interface ColorActivityComponent {

    void inject(ColorActivity activity);
}
