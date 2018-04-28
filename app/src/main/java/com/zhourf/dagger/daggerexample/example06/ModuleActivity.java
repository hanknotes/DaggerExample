package com.zhourf.dagger.daggerexample.example06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class ModuleActivity extends AppCompatActivity {

    @Inject
    Apple apple;

    @Inject
    Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        DaggerModuleActivityComponent.create().inject(this);

        apple.eat();
        book.read();
    }
}
