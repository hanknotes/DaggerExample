package com.zhourf.dagger.daggerexample.example13;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Module
public class TestModule {

    @TestScope
    @Provides
    Green provideGreen(){
        Log.e("green provide","green");
        return new Green();
    }

    @Provides
    Red provideRed(){
        Log.e("red provide","red");
        return new Red();
    }

    @Provides
    IBlue provideBlue(Blue blue){
        Log.e("blue provide","blue");
        return blue;
    }

    @TestScope
    @Provides
    IOrange provideOrange(Orange orange)
    {Log.e("orange provide","orange");
        return orange;
    }
}
