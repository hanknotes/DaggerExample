package com.zhourf.dagger.daggerexample.example22Subcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.DaggerApplication;
import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class TigerActivity extends AppCompatActivity {
    @Inject
    Tiger tiger;

    //获取了基Component提供的依赖
    @Inject
    DaggerApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiger);

        AnimalActivityComponent component = DaggerAnimalActivityComponent.builder().build();
        Log.e("tag", "TigerActivity......");
        component.getTiger().inject(this);
        tiger.roar();
        Log.e("tag", "applicaion=" + application.getPackageName());
    }
}
