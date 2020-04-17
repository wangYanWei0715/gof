package com.designpattern.gof.singleton;

import com.designpattern.gof.singleton.lazy.LazySingletonPattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日$ 22点05分$
 */
public class ThreadRunTest implements Runnable {

    @Override
    public void run() {
        LazySingletonPattern instance = LazySingletonPattern.getInstance();
        System.err.println(Thread.currentThread().getName()+":"+instance);
    }
}
