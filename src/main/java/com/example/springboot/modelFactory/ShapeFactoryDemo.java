package com.example.springboot.modelFactory;

import java.util.Scanner;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 9:53 2020/1/15
 */
public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("请输入需要获取的对象的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Shape shape = shapeFactory.getShape(name);
        shape.draw();
    }
}
