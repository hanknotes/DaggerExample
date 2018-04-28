package com.zhourf.dagger.daggerexample.example11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class BirdActivity extends AppCompatActivity {

    @Inject
    @SparrowQualifier  //标注sparrow注解，表示要使用被SparrowQualifier标注的来源，注入到该字段
    Bird sparrow;

    @Inject
    @ParrotQualifier  //标注parrot注解，表示要使用被ParrotQualifier标注的来源，注入到该字段
    Bird parrot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        DaggerBirdActivityComponent.create().inject(this);

        sparrow.name();
        parrot.name();
    }
}
