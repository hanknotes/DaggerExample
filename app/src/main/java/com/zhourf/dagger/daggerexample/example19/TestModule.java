package com.zhourf.dagger.daggerexample.example19;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class TestModule {
    @Provides
    @IntoMap
    @CustKey(TestEnum.A)
    String provideStrA(){
        return "aaa";
    }

    @Provides
    @IntoMap
    @CustKey(TestEnum.B)
    String provideStrB(){
        return "bbb";
    }
}
