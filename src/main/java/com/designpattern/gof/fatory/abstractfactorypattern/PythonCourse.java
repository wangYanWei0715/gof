package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点47分$
 */
public class PythonCourse implements  ICourse {

    @Override
    public IVideo getVideo() {
        return new PythonVideo();
    }


    @Override
    public INote getNote() {
        return new PythonNote();
    }


    @Override
    public IDance getDance() {
        return new PythonDance();
    }
}
