package com.zhourf.dagger.daggerexample.example20;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class MyModule {
    @Provides
    @IntoMap
    @MyKey(value=MyEnum.A)
    String provideStr1(){
        return "value1";
    }

//    @Provides
//    @IntoMap
//    @MyKey(value=MyEnum.B,name="key02")
//    String provideStr2(){
//        return "value2";
//    }
}
