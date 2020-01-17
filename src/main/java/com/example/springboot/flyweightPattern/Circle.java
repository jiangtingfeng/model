package com.example.springboot.flyweightPattern;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:48 2020/1/17
 */
@Data
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
