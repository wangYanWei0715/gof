package com.designpattern.gof.fatory.simplefactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点17分$
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCoures = courseFactory.create(JavaCoures.class);
        javaCoures.recode();

        ICourse pythonCourse = courseFactory.create(PythonCourse.class);
        pythonCourse.recode();
    }

}
