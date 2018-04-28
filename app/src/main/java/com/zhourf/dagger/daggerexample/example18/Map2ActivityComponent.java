package com.zhourf.dagger.daggerexample.example18;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = {Map2Module.class})
public interface Map2ActivityComponent {
    void inject(Map2Activity activity);
}
