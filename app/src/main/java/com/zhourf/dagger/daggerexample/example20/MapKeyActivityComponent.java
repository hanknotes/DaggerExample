package com.zhourf.dagger.daggerexample.example20;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = MyModule.class)
public interface MapKeyActivityComponent {

    void inject(MapKeyActivity activity);
}
