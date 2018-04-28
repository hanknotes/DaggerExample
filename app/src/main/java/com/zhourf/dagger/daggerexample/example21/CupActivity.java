package com.zhourf.dagger.daggerexample.example21;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class CupActivity extends AppCompatActivity {

    @Inject
    Cup cup;

    @Inject
    Table table;//在TableComponent 中可以找到依赖来源

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cup);

        DaggerCupActivityComponent
                .builder()
                .tableComponent(DaggerTableComponent.create())//因为CupActivityComponent  dependencies了TableComponent,所以这里需要传入TableComponent的实例
                .build()
                .inject(this);

        cup.name();
        table.name();
    }
}
