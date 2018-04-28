package com.zhourf.dagger.daggerexample.example17;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class MouseModule {

    @Provides
    @IntoMap
    @StringKey("key01")
    Mouse provideMouse(){
        return new Mouse("mouse01");
    }

    @Provides
    @IntoMap
    @StringKey("key02")
    Mouse provideMouse2(){
        return new Mouse("mouse02");
    }

}
