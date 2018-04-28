package com.zhourf.dagger.daggerexample.example02;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/24
 * 邮箱：zhourf@glodon.com
 */

public class Book {

    //标注在构造方法上，表示我要用这个构造方法去生成对象
    @Inject
    public Book() {
    }

    public void read(){
        Log.e("book","read 水壶传");
    }
}
