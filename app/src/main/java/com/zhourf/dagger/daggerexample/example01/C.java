package com.zhourf.dagger.daggerexample.example01;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/24
 * 邮箱：zhourf@glodon.com
 */

public class C {

    @Inject
    public C() {
    }

    public void methodC() {
        Log.e("c","ccc");
    }
}
