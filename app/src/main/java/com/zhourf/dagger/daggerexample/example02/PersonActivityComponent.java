package com.zhourf.dagger.daggerexample.example02;

import dagger.Component;

/**
 * 标注在接口上，表示这是一个注入器，针管儿，要打针啦
 * 要给PersonActivity打针，所以接口命名为PersonActivityComponent
 */
@Component
public interface PersonActivityComponent {

    //表示给哪个类注入，这里表示要给PersonActivity打针
    void inject(PersonActivity activity);
}
