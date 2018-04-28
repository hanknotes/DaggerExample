package com.zhourf.dagger.daggerexample.example22Subcomponent;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */

//@Component(dependencies = {LionComponent.class,TigerComponent.class})
@Component(modules = ApplicationModule.class)
public interface AnimalActivityComponent {
    LionComponent getLion();
    TigerComponent getTiger();
}
