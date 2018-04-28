package com.zhourf.dagger.daggerexample.example05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Person5Activity extends AppCompatActivity {

    @Inject
    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person5);

        DaggerPerson4ActivityComponent.create().inject(this);
        Log.e("tag","Person5Activity");
        book.read();

        Intent intent = new Intent(this,Person4Activity.class);
        startActivity(intent);
    }
}
