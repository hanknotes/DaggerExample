package com.zhourf.dagger.daggerexample.example22Subcomponent;

import com.zhourf.dagger.daggerexample.DaggerApplication;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class ApplicationModule {
    @Provides
    DaggerApplication provideApplication(){
        return DaggerApplication.getInstance();
    }
}
