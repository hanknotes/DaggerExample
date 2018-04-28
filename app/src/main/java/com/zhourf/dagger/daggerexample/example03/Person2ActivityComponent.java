package com.zhourf.dagger.daggerexample.example03;

import dagger.Component;

/**
 * 标注在接口上，表示这是一个注入器，针管儿，要打针啦
 * 要给Person2Activity打针，所以接口命名为Person2ActivityComponent
 */
@Component
public interface Person2ActivityComponent {

    //表示给哪个类注入，这里表示要给PersonActivity打针
    void inject(Person2Activity activity);
}
