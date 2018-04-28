package com.zhourf.dagger.daggerexample.example10;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Oriange implements IFruit{
    @Inject
    public Oriange() {
    }

    @Override
    public void name() {
        Log.e("name","oriange");
    }
}
