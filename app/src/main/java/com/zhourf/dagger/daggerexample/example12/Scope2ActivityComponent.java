package com.zhourf.dagger.daggerexample.example12;

import dagger.Component;


@MyScope
@Component
public interface Scope2ActivityComponent {

    void inject(Scope2Activity activity);

    void inject(Scope3Activity activity);
}
