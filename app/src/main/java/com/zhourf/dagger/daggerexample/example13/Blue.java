package com.zhourf.dagger.daggerexample.example13;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@TestScope
public class Blue implements IBlue {

    @Inject
    public Blue() {
        Log.e("blue construct","blue");
    }
}
