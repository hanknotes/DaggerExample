package com.zhourf.dagger.daggerexample.example05;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/24
 * 邮箱：zhourf@glodon.com
 */
@Component
public interface Person4ActivityComponent {

    //给Person4Activity打针
    void inject(Person4Activity activity);

    //给Person5Activity打针
    void inject(Person5Activity activity);
}
