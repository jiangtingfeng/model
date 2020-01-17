package com.example.springboot.modelFactory.abstractModel;

import com.example.springboot.modelFactory.Shape;
import com.example.springboot.modelFactory.ShapeFactory;
import com.example.springboot.modelFactory.modelFactoryTwo.Color;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:06 2020/1/15
 */
public class ShapeFactoryOne extends AbstractFactory {
    /*
    * 继承抽象类的方法
    * */
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShapeOne(String shape) {
        ShapeFactory shapeFactory = new ShapeFactory();
        return shapeFactory.getShape(shape);
    }
}
