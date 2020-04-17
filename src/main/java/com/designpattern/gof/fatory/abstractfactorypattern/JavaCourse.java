package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点38分$
 */
public class JavaCourse implements ICourse {

    @Override
    public IVideo getVideo() {
        return new JavaVideo();
    }


    @Override
    public INote getNote() {
        return new JavaNote();
    }


    @Override
    public IDance getDance() {
        return new JavaDance();
    }
}
