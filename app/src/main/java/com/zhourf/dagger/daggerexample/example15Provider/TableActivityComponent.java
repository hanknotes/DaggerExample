package com.zhourf.dagger.daggerexample.example15Provider;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Component
public interface TableActivityComponent {
    void inject(TableActivity activity);
}
