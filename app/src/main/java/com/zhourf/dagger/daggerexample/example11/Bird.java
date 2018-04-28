package com.zhourf.dagger.daggerexample.example11;

import android.util.Log;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Bird {

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public void name(){
        Log.e("name=",name);
    }
}
