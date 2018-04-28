package com.zhourf.dagger.daggerexample.example19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import java.util.Map;

import javax.inject.Inject;

public class KeyActivity extends AppCompatActivity {

    @Inject
    Map<TestEnum,String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        DaggerKeyActivityComponent.create().inject(this);

        for(Map.Entry<TestEnum,String> entry:map.entrySet())
        {
            Log.e(entry.getKey().toString(),entry.getValue());
        }
    }
}
