package com.zhourf.dagger.daggerexample.example09;

import dagger.Module;
import dagger.Provides;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Module
public class AnimalModule {

    //方式一： 直接在提供的方法内new一个就行了   这时Dog的构造上不需要@Inject
//    @Provides
//    IAnimal provideDog(){
//        return new Dog();
//    }

    //方式二：在接口实现类Cow的构造上@Inject  ，在这里直接当参数传进来，即可
    //这里在参数中有Cow，会去寻找是否有Cow实例的方法，发现Cow的构造上有@Inject   使用。
    @Provides
    IAnimal provideAnimal(Cow cow){
        return cow;
    }
}
