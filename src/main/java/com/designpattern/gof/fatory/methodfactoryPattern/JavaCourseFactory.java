package com.designpattern.gof.fatory.methodfactoryPattern;

import com.designpattern.gof.fatory.simplefactorypattern.ICourse;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCoures();
    }
}
