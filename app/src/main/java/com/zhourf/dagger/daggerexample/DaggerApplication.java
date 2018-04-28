package com.zhourf.dagger.daggerexample;

import android.app.Application;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */

public class DaggerApplication extends Application {
    private static DaggerApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
    public static DaggerApplication getInstance(){
        return instance;
    }
}
