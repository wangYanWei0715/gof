package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class GoCourse implements ICourse {

    @Override
    public IVideo getVideo() {
        return new GoVideo();
    }


    @Override
    public INote getNote() {
        return new GoNote();
    }


    @Override
    public IDance getDance() {
        return new GoDance();
    }


}
