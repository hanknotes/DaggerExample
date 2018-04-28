package com.zhourf.dagger.daggerexample.example11;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Module
public class BirdModule {

    //不同的来源标注不同的Qualifier，用于区分

    @Provides
    @SparrowQualifier    //标注sparrow注解，表示这是sparrow对象的来源
    Bird provideBird1(){
        return new Bird("sparrow");
    }

    @Provides
    @ParrotQualifier  //标注parot注解，表示这是parrot对象的来源
    Bird provideBird2(){
        return new Bird("parrot");
    }
}
