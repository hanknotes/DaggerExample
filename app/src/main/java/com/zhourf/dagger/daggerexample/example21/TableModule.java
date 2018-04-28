package com.zhourf.dagger.daggerexample.example21;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class TableModule {
    @Provides
    Table provideTable(){
        return new Table();
    }
}
