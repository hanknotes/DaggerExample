package com.zhourf.dagger.daggerexample.example13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class ColorActivity extends AppCompatActivity {

    @Inject
    Green green1;
    @Inject
    Green green2;

    @Inject
    Red red1;
    @Inject
    Red red2;

    @Inject
    IBlue blue1;
    @Inject
    IBlue blue2;

    @Inject
    IOrange orange1;
    @Inject
    IOrange orange2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        DaggerColorActivityComponent.create().inject(this);


        log("green1",green1.hashCode());
        log("green2",green2.hashCode());
        log("red1",red1.hashCode());
        log("red2",red2.hashCode());
        log("blue1",blue1.hashCode());
        log("blue2",blue2.hashCode());
        log("orange1",orange1.hashCode());
        log("orange2",orange2.hashCode());
    }

    private void log(String tag,int msg){
        Log.e(tag,msg+"");
    }
}
