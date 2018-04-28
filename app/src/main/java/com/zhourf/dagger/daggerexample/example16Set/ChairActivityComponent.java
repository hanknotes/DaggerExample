package com.zhourf.dagger.daggerexample.example16Set;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = ChairModule.class)
public interface ChairActivityComponent {

    void inject(ChairActivity activity);
}
