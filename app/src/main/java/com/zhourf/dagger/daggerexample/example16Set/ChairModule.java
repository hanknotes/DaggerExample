package com.zhourf.dagger.daggerexample.example16Set;

import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class ChairModule {

    @Provides
    @IntoSet
    Desk provideDesk3(){
        return new Desk("ChairModule  desk---");
    }

    @Provides
    @ElementsIntoSet
    Set<Desk> provideDesks(){
        Set<Desk> s = new HashSet<>();
        s.add(new Desk("ChairModule   ElementsIntoSet  desk///"));
        s.add(new Desk("ChairModule   ElementsIntoSet  desk+++"));
        return s;
    }
}
