package com.zhourf.dagger.daggerexample.example09;

import android.util.Log;

import javax.inject.Inject;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */

public class Cow implements IAnimal {

    //注意这里需要标注@Inject
    @Inject
    public Cow() {
    }

    @Override
    public void bark() {
        Log.e("cow bark","哞哞哞");
    }
}
