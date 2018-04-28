package com.zhourf.dagger.daggerexample.example09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Animal2Activity extends AppCompatActivity {

    @Inject
    IAnimal animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal2);

        DaggerAnimal2ActivityComponent.create().inject(this);

        animal.bark();

    }
}
