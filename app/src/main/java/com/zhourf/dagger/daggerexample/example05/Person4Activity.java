package com.zhourf.dagger.daggerexample.example05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Person4Activity extends AppCompatActivity {

    @Inject
    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person4);

        DaggerPerson4ActivityComponent.create().inject(this);
        Log.e("tag","Person4Activity");
        book.read();

    }
}
