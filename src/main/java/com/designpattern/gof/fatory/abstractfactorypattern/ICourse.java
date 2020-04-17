package com.designpattern.gof.fatory.abstractfactorypattern;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点37分$
 */
public interface ICourse {

    IVideo getVideo();

    INote getNote();

    IDance getDance();

}
