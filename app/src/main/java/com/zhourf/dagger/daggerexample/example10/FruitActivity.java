package com.zhourf.dagger.daggerexample.example10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;
import javax.inject.Named;

public class FruitActivity extends AppCompatActivity {


    @Inject
    @Named("banana")   //标记是用哪个来源进行注入
    IFruit banana;

    @Inject
    @Named("oriange")   //标记是用哪个来源进行注入
    IFruit oriange;

    @Inject   //对应的是Pear中的构造方法上的@Inject   注意构造方法上不能打@Named
    Pear pear1;

    @Inject
    @Named("pear2")   //对应的是FruitModule中的方法
    Pear pear2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit2);

        DaggerFruitActivityComponent.create().inject(this);

        banana.name();
        oriange.name();

        pear1.name();
        pear2.name();
    }
}
