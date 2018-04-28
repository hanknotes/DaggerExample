package com.zhourf.dagger.daggerexample.example06;

import dagger.Component;

//这里的modules=Mydule.class   表示我这个注入器，从MyModule中寻找提供对象实例的方法
@Component(modules = MyModule.class)
public interface ModuleActivityComponent {

    void inject(ModuleActivity activity);
}
