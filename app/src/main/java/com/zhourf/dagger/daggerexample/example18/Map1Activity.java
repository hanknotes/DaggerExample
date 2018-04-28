package com.zhourf.dagger.daggerexample.example18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import java.util.Map;

import javax.inject.Inject;

public class Map1Activity extends AppCompatActivity {

    @Inject
    Map<String,String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);

        DaggerMap1ActivityComponent.create().inject(this);


        Log.e("tag","Map1Activity-----------1111");
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            Log.e(entry.getKey(),entry.getValue());
        }

        startActivity(new Intent(this,Map2Activity.class));
    }
}
