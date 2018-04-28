package com.zhourf.dagger.daggerexample.example10;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Pear implements IFruit {

    public String name = "China";
    @Inject  //注意构造方法上不能打@Named
    public Pear() {
        name = "China";
    }


    public Pear(String name) {
        this.name = name;
    }

    @Override
    public void name() {
        Log.e("name",name);
    }
}
