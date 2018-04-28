package com.zhourf.dagger.daggerexample.example15Provider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;
import javax.inject.Provider;

public class TableActivity extends AppCompatActivity {

    @Inject
    Provider<Table> provider1;//此时没有调用构造函数
    @Inject
    Provider<Table> provider2;//此时没有调用构造函数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        DaggerTableActivityComponent.create().inject(this);
        Log.e("tag","----------");

        log("provider1 get1",provider1.get().hashCode());//此时调用构造函数，不缓存
        log("provider1 get2",provider1.get().hashCode());//此时依然调用构造函数，重新创建
        log("provider2 get1",provider2.get().hashCode());//此时调用构造函数，不缓存
        log("provider2 get2",provider2.get().hashCode());//此时依然调用构造函数，重新创建
    }
    private void log(String tag,int msg){
        Log.e(tag,msg+"");
    }

}
