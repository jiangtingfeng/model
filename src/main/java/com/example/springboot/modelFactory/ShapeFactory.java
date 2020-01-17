package com.example.springboot.modelFactory;

import org.springframework.util.StringUtils;

/**
 * @Author: jiangtingfeng
 * @Description: 形状工厂类
 * @Date :Create in 9:48 2020/1/15
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        if ("RECTANGE".equalsIgnoreCase(shapeType)) {
            return new Rectangele();
        }
        if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
