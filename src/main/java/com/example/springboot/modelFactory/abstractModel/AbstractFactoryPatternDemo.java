package com.example.springboot.modelFactory.abstractModel;

import com.example.springboot.modelFactory.Shape;
import com.example.springboot.modelFactory.modelFactoryTwo.Color;

import java.util.Scanner;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:25 2020/1/15
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        System.out.println("请输入需要生产的产品:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        AbstractFactory abstractFactory = FactoryProducer.getFacroty(name);
        System.out.println("请输入相应产品的相应的属性:");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        if (name.equalsIgnoreCase("SHAPE")) {
            Shape shapeOne = abstractFactory.getShapeOne(name1);
            shapeOne.draw();
        } else {
            Color color = abstractFactory.getColor(name1);
            color.fill();
        }
    }
}
