package com.zhourf.dagger.daggerexample.example06;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/24
 * 邮箱：zhourf@glodon.com
 */
//模拟来源于第三方sdk的类，不能修改其源码
public class Book {

    public Book() {
    }

    public void read(){
        Log.e("book","read 三国演义");
    }
}
