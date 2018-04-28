package com.zhourf.dagger.daggerexample.example16Set;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import java.util.Set;

import javax.inject.Inject;

public class DeskActivity extends AppCompatActivity {

    @Inject
    Set<String> ss;

    @Inject
    Set<Desk> sd;

    @Inject
    Set<Chair> sc;

    @Inject
    Desk d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desk);

        DaggerSetActivityComponent.create().inject(this);
        Log.e("start","deskActivity---------");

        for(String str:ss){
            Log.e("ss=",str);
        }

        for(Desk d :sd){
            Log.e("sd=",d.toString());
        }

        for(Chair c : sc)
        {
            Log.e("sc=",c.toString());
        }

        Log.e("d=",d.toString());

        startActivity(new Intent(this,ChairActivity.class));
    }
}
