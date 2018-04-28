package com.zhourf.dagger.daggerexample.example16Set;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */

public class Desk {

    public String name;

    public Desk(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "name='" + name + '\'' +
                '}';
    }
}
