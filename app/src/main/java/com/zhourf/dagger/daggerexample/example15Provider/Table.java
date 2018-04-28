package com.zhourf.dagger.daggerexample.example15Provider;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */

public class Table {

    @Inject
    public Table() {
        Log.e("table construct","table");
    }
}
