package com.designpattern.gof.fatory.methodfactoryPattern;

import com.designpattern.gof.fatory.simplefactorypattern.ICourse;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点14分$
 */
public class JavaCoures implements ICourse {

    @Override
    public void recode() {
        System.out.println("这是java课程");
    }
}
