package com.zhourf.dagger.daggerexample.example21;

import dagger.Component;

/**
 * dependencies  表示依赖其他的component  从而寻找依赖来源
 */
@Component(modules = CupModule.class,dependencies = TableComponent.class)
public interface CupActivityComponent {

    void inject(CupActivity activity);
}
