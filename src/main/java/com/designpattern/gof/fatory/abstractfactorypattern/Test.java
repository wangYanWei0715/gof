package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class Test {

    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create().getNote().editNote();
        javaCourseFactory.create().getVideo().leanVide();

        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create().getNote().editNote();
        pythonCourseFactory.create().getVideo().leanVide();

        ICourseFactory goCourseFactory = new GoCourseFactory();
        goCourseFactory.create().getVideo().leanVide();
        goCourseFactory.create().getNote().editNote();
        goCourseFactory.create().getDance().jumpDance();

    }


}
