package com.zhourf.dagger.daggerexample.example17;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Module
public class Mouse2Module {

    @Provides
    @IntoMap
    @StringKey("key03")
    Mouse provideMouse3(){
        return new Mouse("mouse03");
    }

    @Provides
    @IntoMap
    @ClassKey(Mouse.class)
    Mouse provideMouse4(){
        return new Mouse("mouse04");
    }

    @Provides
    @IntoMap
    @ClassKey(MouseModule.class)
    KeyBoard provideMouse5(){
        return new KeyBoard("keyboard01");
    }

    @Provides
    @IntoMap
    @ClassKey(Mouse2Module.class)
    Object provideMouse6(){
        return new KeyBoard("object");
    }
}
