package com.zhourf.dagger.daggerexample.example17;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = {MouseModule.class,Mouse2Module.class})
public interface MapActivityComponent {
    void inject(MapActivity activity);
}
