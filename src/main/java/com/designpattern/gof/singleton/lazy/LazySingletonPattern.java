package com.designpattern.gof.singleton.lazy;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日$ 21点27分$
 */
public class LazySingletonPattern {

    private volatile static LazySingletonPattern lazySingletonPattern;

    private LazySingletonPattern (){}

    public static LazySingletonPattern getInstance(){
        if (null == lazySingletonPattern){
            synchronized (LazySingletonPattern.class){
                if (null == lazySingletonPattern){
                    //会出现指令重排序的问题 所以要给 lazySingletonPattern 全部变量加上volatile
                    lazySingletonPattern = new LazySingletonPattern();
                }
            }
        }
        return lazySingletonPattern;
    }

}
