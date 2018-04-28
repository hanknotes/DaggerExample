package com.zhourf.dagger.daggerexample.example21;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */
@Component(modules = TableModule.class)
public interface TableComponent {
    //这么定义，会从所依赖的module中寻找
    //一般是供其他component依赖时这么定义
    Table getTable();
}
