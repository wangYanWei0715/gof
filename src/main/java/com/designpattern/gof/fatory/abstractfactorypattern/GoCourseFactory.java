package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class GoCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new GoCourse();
    }
}
