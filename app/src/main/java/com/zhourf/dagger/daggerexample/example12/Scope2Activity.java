package com.zhourf.dagger.daggerexample.example12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Scope2Activity extends AppCompatActivity {

    @Inject
    Laptop laptop03;
    @Inject
    Laptop laptop04;

    @Inject
    Mobile mobile03;

    @Inject
    Mobile mobile04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope2);

        DaggerScope2ActivityComponent.create().inject(this);

        log(laptop03.hashCode()+"");
        log(laptop04.hashCode()+"");
        log(mobile03.hashCode()+"");
        log(mobile04.hashCode()+"");

        startActivity(new Intent(this,Scope3Activity.class));
    }

    private void log(String msg){
        Log.e("msg",msg);
    }
}
