package com.zhourf.dagger.daggerexample.example10;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = FruitModule.class)
public interface FruitActivityComponent {
    void inject(FruitActivity activity);
}
