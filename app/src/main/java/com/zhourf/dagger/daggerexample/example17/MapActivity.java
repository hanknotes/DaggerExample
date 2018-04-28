package com.zhourf.dagger.daggerexample.example17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import java.util.Map;

import javax.inject.Inject;

import dagger.multibindings.IntoMap;

public class MapActivity extends AppCompatActivity {

    @Inject
    Map<String,Mouse> map;

    @Inject
    Map<Class<?>,Mouse > map2;

    @Inject
    Map<Class<?>,KeyBoard> map3;

    @Inject
    Map<Class<?>,Object> map4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        DaggerMapActivityComponent.create().inject(this);

        Log.e("tag","-----------");
        for(Map.Entry<String,Mouse> entry : map.entrySet()){
            Log.e(entry.getKey(),entry.getValue().toString());
        }
        Log.e("tag","-----------");
        for(Map.Entry<Class<?>,Mouse> entry : map2.entrySet()){
            Log.e(entry.getKey().getName(),entry.getValue().toString());
        }
        Log.e("tag","-----------");
        for(Map.Entry<Class<?>,KeyBoard> entry : map3.entrySet()){
            Log.e(entry.getKey().getName(),entry.getValue().toString());
        }
        Log.e("tag","-----------");
        for(Map.Entry<Class<?>,Object> entry : map4.entrySet()){
            Log.e(entry.getKey().getName(),entry.getValue().toString());
        }
    }
}
