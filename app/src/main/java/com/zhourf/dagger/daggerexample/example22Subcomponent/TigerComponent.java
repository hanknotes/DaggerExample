package com.zhourf.dagger.daggerexample.example22Subcomponent;

import dagger.Component;
import dagger.Subcomponent;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Subcomponent(modules = TigerModule.class)
public interface TigerComponent {
    void inject(TigerActivity activity);
}
