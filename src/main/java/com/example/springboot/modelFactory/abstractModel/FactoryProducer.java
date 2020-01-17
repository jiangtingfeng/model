package com.example.springboot.modelFactory.abstractModel;

/**
 * @Author: jiangtingfeng
 * @Description: 创建工厂创建器 生成器类
 * @Date :Create in 10:21 2020/1/15
 */
public class FactoryProducer {

    public static AbstractFactory getFacroty(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactoryOne();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
