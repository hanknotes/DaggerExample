package com.zhourf.dagger.daggerexample.example08;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Dog implements IAnimal {

    //这里对接口实现类的构造进行标注
    @Inject
    public Dog() {
    }
    public void bark(){
        Log.e("dog bark","汪汪汪");
    }
}
