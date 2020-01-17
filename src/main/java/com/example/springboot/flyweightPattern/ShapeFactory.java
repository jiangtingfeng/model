package com.example.springboot.flyweightPattern;

import java.util.HashMap;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:50 2020/1/17
 */
public class ShapeFactory {

    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color :" + color);
        }

        return circle;
    }
}
