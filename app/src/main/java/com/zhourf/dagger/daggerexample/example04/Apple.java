package com.zhourf.dagger.daggerexample.example04;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/24
 * 邮箱：zhourf@glodon.com
 */

public class Apple {

    //标注在构造方法上，表示我要用这个构造方法去生成对象
    @Inject
    public Apple() {
    }

    public void eat(){
        Log.e("apple","eat bugs");
    }
}
