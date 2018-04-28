package com.zhourf.dagger.daggerexample.example06;

import dagger.Module;
import dagger.Provides;

/**
 * 表示向构造器提供对象的类
 */
@Module
public class MyModule {

    //标注在方法上，表示具体的提供对象的方法
    @Provides
    Apple provideApple(){
        return new Apple();//这里需要new了
    }

    //标注在方法上，表示具体的提供对象的方法
    @Provides
    Book provideBook(){
        return new Book();//这里需要new了
    }
}
