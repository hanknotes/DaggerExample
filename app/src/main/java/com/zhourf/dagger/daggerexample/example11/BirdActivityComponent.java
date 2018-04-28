package com.zhourf.dagger.daggerexample.example11;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = BirdModule.class)
public interface BirdActivityComponent {

    void inject(BirdActivity activity);
}
