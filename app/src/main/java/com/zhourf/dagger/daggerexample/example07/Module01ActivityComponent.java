package com.zhourf.dagger.daggerexample.example07;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/25
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = {AppleModule.class,BookModule.class})
public interface Module01ActivityComponent {

    void inject(Module01Activity activity);
}
