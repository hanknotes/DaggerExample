package com.zhourf.dagger.daggerexample.example02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class PersonActivity extends AppCompatActivity {

    //标注在属性上，表示我要往这个属性内注入对象，记得是非private的
    @Inject
    Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        //在写这里之前记得先Build-make project下，在编译期内会生成一些代码
        //DaggerPersonActivityComponent就是在make后生成的，不make，是找不到这个类的，命名规则是：Dagger+component接口名
        //PersonActivity + Component
        //Dagger + PersonActivityComponent
        //清楚了没
        //言归正传，这里的作用是要给这个类注入内容
        DaggerPersonActivityComponent.create().inject(this);

        //直接调用方法就行了
        book.read();
    }
}
