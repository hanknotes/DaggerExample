package com.zhourf.dagger.daggerexample.example16Set;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = {DeskModule.class,Desk2Module.class})
public interface SetActivityComponent {

    void inject(SetActivity activity);
    void inject(DeskActivity activity);
}
