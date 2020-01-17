package com.example.springboot.facadePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:36 2020/1/17
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
