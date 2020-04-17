package com.designpattern.gof.singleton.lazy;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日$ 22点33分$
 */
public class LazyInnerClassSingletonPattern {

    // 优点： 省内存 性能高 一般情况可以保证单例
    //缺点： 能被反射破环
    private LazyInnerClassSingletonPattern(){}

    public LazyInnerClassSingletonPattern getInstance(){
        return LazyInnerClassHolder.HOLDER;
    }

    private static class LazyInnerClassHolder{
        private static final LazyInnerClassSingletonPattern  HOLDER = new LazyInnerClassSingletonPattern();
    }


}
