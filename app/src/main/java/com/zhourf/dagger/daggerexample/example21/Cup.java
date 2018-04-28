package com.zhourf.dagger.daggerexample.example21;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */

public class Cup {
    @Inject
    public Cup() {
    }

    public void name(){
        Log.e("cup tag","cups");
    }
}
