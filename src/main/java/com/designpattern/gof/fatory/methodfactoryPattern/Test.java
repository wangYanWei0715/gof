package com.designpattern.gof.fatory.methodfactoryPattern;

import com.designpattern.gof.fatory.simplefactorypattern.ICourse;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class Test {

    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse iCourse = javaCourseFactory.create();
        iCourse.recode();

    }


}
