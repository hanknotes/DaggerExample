package com.zhourf.dagger.daggerexample.example22Subcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class TigerModule {

    @Provides
    Tiger provideTiger()
    {
        return new Tiger();
    }
}
