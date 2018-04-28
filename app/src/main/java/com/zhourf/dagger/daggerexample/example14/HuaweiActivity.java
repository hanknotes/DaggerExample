package com.zhourf.dagger.daggerexample.example14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

import dagger.Lazy;

public class HuaweiActivity extends AppCompatActivity {

    @Inject
    HuaWei hw1;//这时就直接调用依赖来源去创建对象了

    @Inject
    Lazy<HuaWei> lhw1;//此时没有调用依赖来源去创建对象

    @Inject
    Lazy<HuaWei> lhw2;//此时没有调用依赖来源去创建对象

    @Inject
    HuaWei hw2;//这时就直接调用依赖来源去创建对象了

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huawei);

        DaggerHuaweiActivityComponent.create().inject(this);

        Log.e("start","--------------------");
        log("hw1",hw1.hashCode());
        log("lhw1",lhw1.get().hashCode());//当第一次调用get时，才调用依赖来源去创建对象，然后缓存起来
        log("lhw1",lhw1.get().hashCode());//当第二次调用get时，使用第一次的缓存
        log("hw2",hw2.hashCode());
        log("lhw2",lhw2.get().hashCode());//当第一次调用get时，才调用依赖来源去创建对象，然后缓存起来。需要注意的是两个Lazy是完全独立的，不会共享缓存
        log("lhw2",lhw2.get().hashCode());//当第二次调用get时，使用第一次的缓存
    }

    private void log(String tag,int msg){
        Log.e(tag,msg+"");
    }
}
