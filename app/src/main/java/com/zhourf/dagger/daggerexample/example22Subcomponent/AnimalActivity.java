package com.zhourf.dagger.daggerexample.example22Subcomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class AnimalActivity extends AppCompatActivity {

    @Inject
    Lion lion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal3);

        DaggerAnimalActivityComponent.builder().build()//获取基Component
                .getLion()//获取子component  LionComponent
                .inject(this);  //注入此地
        lion.roar();

        startActivity(new Intent(this,TigerActivity.class));
    }
}
