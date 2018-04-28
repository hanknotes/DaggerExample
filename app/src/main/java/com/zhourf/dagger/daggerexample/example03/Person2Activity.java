package com.zhourf.dagger.daggerexample.example03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zhourf.dagger.daggerexample.R;

import javax.inject.Inject;

public class Person2Activity extends AppCompatActivity {


    private Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        //在写这里之前记得先Build-make project下，在编译期内会生成一些代码
        //DaggerPerson2ActivityComponent就是在make后生成的，不make，是找不到这个类的，命名规则是：Dagger+component接口名
        //Person2Activity + Component
        //Dagger + Person2ActivityComponent
        //清楚了没
        //言归正传，这里的作用是要给这个类注入内容
        DaggerPerson2ActivityComponent.create().inject(this);

        //直接调用方法就行了
        book.read();
    }

    //标注在方法上，类似set   表示我要往这个属性内注入对象，记得这里的属性可以是private的
    @Inject
    public void setBook(Book book){
        this.book = book;
        //这里就获取到了this，可以直接使用this了
        this.load();
    }

    //对象的方法
    public void load(){
        Log.e("load","hello world");
    }
}
