package com.zhourf.dagger.daggerexample.example17;

/**
 * 描述：
 * 作者：zhourf on 2018/4/28
 * 邮箱：zhourf@glodon.com
 */

public class Mouse {
    public String name;

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }

    public Mouse(String name) {
        this.name = name;
    }
}
