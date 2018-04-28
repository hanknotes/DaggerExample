package com.zhourf.dagger.daggerexample.example12;

import dagger.Component;

/**
 * 描述：
 * 作者：zhourf on 2018/4/27
 * 邮箱：zhourf@glodon.com
 */
@MyScope   //注意要在这里标注@MyScope，因为目标类ScopeActivity中，有个被@Inject标注的字段，而这个字段所属的类被@MyScope标注了，所以这个Component必须标注
@Component
public interface ScopeActivityComponent {
    void inject(ScopeActivity activity);
}
