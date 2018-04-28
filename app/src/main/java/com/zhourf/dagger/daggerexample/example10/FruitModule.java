package com.zhourf.dagger.daggerexample.example10;

import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Module
public class FruitModule {

    @Provides
    @Named("banana")//打标记，标记来源，用于区分
    IFruit provideBanana(){
        return new Banana();
    }

    @Provides
    @Named("oriange")//打标记，标记来源，用于区分
    IFruit provideOriange(Oriange oriange){
        return oriange;
    }

    @Provides
    @Named("pear2")
    Pear providePear(){
        Log.e("from","module pear");
        return new Pear("America");
    }
}
