package com.example.springboot.decoratorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:16 2020/1/17
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        //todo something
        System.out.println("我是矩形");
    }
}
