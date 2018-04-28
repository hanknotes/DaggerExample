package com.zhourf.dagger.daggerexample.example09;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = AnimalModule.class)
public interface Animal2ActivityComponent {

    void inject(Animal2Activity activity);
}
