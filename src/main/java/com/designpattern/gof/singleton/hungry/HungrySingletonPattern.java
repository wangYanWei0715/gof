package com.designpattern.gof.singleton.hungry;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日14点15分
 */
public class HungrySingletonPattern {

    private static final  HungrySingletonPattern hsp = new HungrySingletonPattern();

    private HungrySingletonPattern(){};

    public static HungrySingletonPattern getInstance(){
        return hsp;
    }



}
