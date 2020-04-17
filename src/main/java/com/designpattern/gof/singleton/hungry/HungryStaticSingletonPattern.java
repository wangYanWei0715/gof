package com.designpattern.gof.singleton.hungry;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月28日$ 14点17分$
 */
public class HungryStaticSingletonPattern {
    //类里面的加载顺序
    //先静态后动态
    //先上后下
    //先变量后方法

    private  final static  HungryStaticSingletonPattern hungryStaticSingletonPattern;

    static {
        hungryStaticSingletonPattern = new HungryStaticSingletonPattern();
    }
    private HungryStaticSingletonPattern (){};

    public static HungryStaticSingletonPattern getInstance(){
        return hungryStaticSingletonPattern;
    }

}
