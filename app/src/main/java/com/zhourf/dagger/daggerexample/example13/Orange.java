package com.zhourf.dagger.daggerexample.example13;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@TestScope
public class Orange implements IOrange {

    @Inject
    public Orange() {
        Log.e("Orange construct","Orange");
    }
}
