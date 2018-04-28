package com.zhourf.dagger.daggerexample.example16Set;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */

public class Chair {
    public String name;
    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                '}';
    }
    public Chair(String name) {
        this.name = name;
    }
}
