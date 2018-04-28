package com.zhourf.dagger.daggerexample.example14;

import javax.inject.Inject;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@Component
public interface HuaweiActivityComponent {
    void inject(HuaweiActivity activity);
}
