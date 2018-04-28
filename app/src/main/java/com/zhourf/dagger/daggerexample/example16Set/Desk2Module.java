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
public class Desk2Module {

    @Provides
    @IntoSet  //这个返回值是Set<Desk>   也会被放到Set<Desk>中   且与DeskModule中的是同一个Set<Desk>
    Desk provideDesk(){
        return new Desk("Desk2Module   intoset 2dest4");
    }

    @Provides
    @IntoSet  //这个返回值是Set<Chair>   也会被放到Set<Chair>中   且与DeskModule中的是同一个Set<Chair>
    Chair provideChair(){
        return new Chair("Desk2Module   intoset 2chair4");
    }

    @Provides
    @ElementsIntoSet   //这个返回值是Set<Chair>   也会被放到Set<Chair>中   且与DeskModule中的是同一个Set<Chair>
    Set<Chair> provideSetChair(){
        Set<Chair> set = new HashSet<>();
        set.add(new Chair("Desk2Module   ElementsIntoSet 2chair5"));
        set.add(new Chair("Desk2Module   ElementsIntoSet  2hair6"));
        return set;
    }


    @Provides
    @IntoSet//这个返回值是Set<String>   也会被放到Set<String>中   且与DeskModule中的是同一个Set<String>
    String provideName(){
        return "Desk2Module   2bbbb";
    }
}
