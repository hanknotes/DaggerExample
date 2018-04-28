package com.zhourf.dagger.daggerexample.example09;

import android.util.Log;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Dog implements IAnimal {

    //这里不需要标注@Inject
    public Dog() {
    }
    public void bark(){
        Log.e("dog bark","汪汪汪");
    }
}
