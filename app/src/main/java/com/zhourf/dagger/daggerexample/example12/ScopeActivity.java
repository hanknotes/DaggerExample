package com.zhourf.dagger.daggerexample.example12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class ScopeActivity extends AppCompatActivity {

    @Inject
    Laptop laptop01;
    @Inject
    Laptop laptop02;

    @Inject
    Mobile mobile01;

    @Inject
    Mobile mobile02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope);

        DaggerScopeActivityComponent.create().inject(this);

        log(laptop01.hashCode()+"");
        log(laptop02.hashCode()+"");
        log(mobile01.hashCode()+"");
        log(mobile02.hashCode()+"");

        startActivity(new Intent(this,Scope2Activity.class));
    }

    private void log(String msg){
        Log.e("msg",msg);
    }
}
