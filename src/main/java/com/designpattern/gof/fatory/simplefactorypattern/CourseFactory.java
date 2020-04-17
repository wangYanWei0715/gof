package com.designpattern.gof.fatory.simplefactorypattern;

import java.util.Objects;

/**
 * @author 王延伟
 * @description TODO
 * @createTime 2020年3月26日$ 23点21分$
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){

        try {
            if (Objects.nonNull(clazz)){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
