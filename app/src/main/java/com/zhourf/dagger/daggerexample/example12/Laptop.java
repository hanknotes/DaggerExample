package com.zhourf.dagger.daggerexample.example12;

import android.util.Log;

import javax.inject.Inject;

/**
 * 注意是这个类上标注了自定义的一个主机@MyScope
 */
@MyScope
public class Laptop {
    //构造上标注了@Inject
    @Inject
    public Laptop() {
        Log.e("laptop","laptop");
    }
}
