package com.zhourf.dagger.daggerexample.example22Subcomponent;

import dagger.Component;
import dagger.Subcomponent;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
//注意这里是Subcomponent
@Subcomponent(modules = LionModule.class)
public interface LionComponent {
   void inject(AnimalActivity activity);
}
