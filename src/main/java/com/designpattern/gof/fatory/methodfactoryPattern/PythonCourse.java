package com.designpattern.gof.fatory.methodfactoryPattern;

import com.designpattern.gof.fatory.simplefactorypattern.ICourse;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ $
 */
public class PythonCourse implements ICourse {

    @Override
    public void recode() {
        System.out.println("这是python课程");
    }
}
