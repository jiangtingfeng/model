package com.example.springboot.facadePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:38 2020/1/17
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw");
    }
}
