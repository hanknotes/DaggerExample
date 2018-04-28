package com.zhourf.dagger.daggerexample.example18;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class Map2Module {

    @Provides
    @IntoMap
    @StringKey("key02")
    String provideStr1(){
        return "value02";
    }
}
