package com.zhourf.dagger.daggerexample.example07;


import dagger.Module;
import dagger.Provides;

/**
 * 表示向构造器提供Book对象的类
 */
@Module
public class BookModule {


    //标注在方法上，表示具体的提供对象的方法
    @Provides
    Book provideBook(){
        return new Book();//这里需要new了
    }
}
