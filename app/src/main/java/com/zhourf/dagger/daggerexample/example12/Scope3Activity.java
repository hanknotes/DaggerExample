package com.zhourf.dagger.daggerexample.example12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Scope3Activity extends AppCompatActivity {

    @Inject
    Laptop laptop05;
    @Inject
    Laptop laptop06;

    @Inject
    Mobile mobile05;

    @Inject
    Mobile mobile06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope3);

        DaggerScope2ActivityComponent.create().inject(this);

        log(laptop05.hashCode()+"");
        log(laptop06.hashCode()+"");
        log(mobile05.hashCode()+"");
        log(mobile06.hashCode()+"");
    }

    private void log(String msg){
        Log.e("msg",msg);
    }
}
