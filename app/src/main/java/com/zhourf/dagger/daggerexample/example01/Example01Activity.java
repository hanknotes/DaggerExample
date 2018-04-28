package com.zhourf.dagger.daggerexample.example01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Example01Activity extends AppCompatActivity {

    @Inject
    C c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example01);

        DaggerExample01ActivityComponent.create().inject(this);
        c.methodC();
    }
}
