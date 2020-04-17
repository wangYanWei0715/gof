package com.designpattern.gof.singleton;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日$ 22点07分$
 */
public class ThreadRunTestDome {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunTest());
        Thread thread1 = new Thread(new ThreadRunTest());
        thread.start();
        thread1.start();
        System.out.println("end");
    }

}
