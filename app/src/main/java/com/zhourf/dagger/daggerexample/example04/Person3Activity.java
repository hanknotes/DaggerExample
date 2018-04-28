package com.zhourf.dagger.daggerexample.example04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Person3Activity extends AppCompatActivity {

    @Inject
    Book book;

    private Apple apple;

    @Inject
    Apple apple2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person3);

        DaggerPerson3ActivityComponent.create().inject(this);

        book.read();
        apple.eat();
        apple2.eat();
    }

    @Inject
    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
