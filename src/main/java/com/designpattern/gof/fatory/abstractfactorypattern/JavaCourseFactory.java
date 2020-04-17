package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ $
 */
public class JavaCourseFactory implements ICourseFactory {


    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
