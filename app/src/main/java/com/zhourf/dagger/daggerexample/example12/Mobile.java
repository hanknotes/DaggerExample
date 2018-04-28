package com.zhourf.dagger.daggerexample.example12;

import android.util.Log;

import javax.inject.Inject;

/**
 * 这里没有标注自定义的@MyScope
 */
public class Mobile {
    //构造上标注了@Inject
    @Inject
    public Mobile() {
        Log.e("mobile","mobile");
    }
}
