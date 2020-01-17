package com.example.springboot.facadePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:37 2020/1/17
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw");
    }
}
