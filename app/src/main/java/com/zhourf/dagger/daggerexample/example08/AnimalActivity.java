package com.zhourf.dagger.daggerexample.example08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class AnimalActivity extends AppCompatActivity {

    //这里对接口声明的字段标注
//    @Inject
//    IAnimal animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

//        DaggerAnimalActivityComponent.create().inject(this);
//
//        animal.bark();
    }
}
