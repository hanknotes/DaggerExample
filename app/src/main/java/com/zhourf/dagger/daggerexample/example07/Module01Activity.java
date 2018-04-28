package com.zhourf.dagger.daggerexample.example07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Module01Activity extends AppCompatActivity {

    @Inject
    Apple apple;

    @Inject
    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module01);

        DaggerModule01ActivityComponent.create().inject(this);

        apple.eat();
        book.read();
    }
}
