package com.zhourf.dagger.daggerexample.example08;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Component
public interface AnimalActivityComponent {

    void inject(AnimalActivity activity);
}
