package com.zhourf.dagger.daggerexample.example16Set;

import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Module
public class DeskModule {

    @Provides
    @IntoSet   //这里的Desk会被放到Set<Desk>中    对应的返回值其实是Set<Desk>
    Desk provideDesk(){
        return new Desk("   DeskModule   intoset dest1");
    }

    @Provides
    @IntoSet  //这里的Desk会被放到Set<Desk>中，且是同一个set，就算跨Activity了也是同一个     对应的返回值其实是Set<Desk>
    Desk provideDesk3(){
        return new Desk("DeskModule   intoset dest2");
    }

    @Provides
    @IntoSet  //这里的Chair会被放到Set<Chair>中     对应的返回值其实是Set<Chair>
    Chair provideChair(){
        return new Chair("DeskModule   intoset chair1");
    }

    @Provides
    @ElementsIntoSet   //这里的Chair会被放到Set<Chair>中  且是同一个Set<Chair>   对应的返回值其实是Set<Chair>
    Set<Chair> provideSetChair(){
        Set<Chair> set = new HashSet<>();
        set.add(new Chair(" DeskModule   elementsIntoSet  chair2"));
        set.add(new Chair("DeskModule   elementsIntoSet   chair3"));
        return set;
    }

    @Provides  //返回值是Desk
    Desk provideDesk2(){
        return new Desk("DeskModule   desk3");
    }

    @Provides
    @IntoSet   //这里的Chair会被放到Set<String>中  且是同一个Set<String>   对应的返回值其实是Set<String>
    String provideName(){
        return "DeskModule   aaaa";
    }
}
