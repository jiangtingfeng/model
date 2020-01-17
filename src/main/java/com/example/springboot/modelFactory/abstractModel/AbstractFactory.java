package com.example.springboot.modelFactory.abstractModel;

import com.example.springboot.modelFactory.Shape;
import com.example.springboot.modelFactory.modelFactoryTwo.Color;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:04 2020/1/15
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShapeOne(String shape);
}
