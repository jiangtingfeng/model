package com.example.springboot.decoratorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:17 2020/1/17
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        //todo something
        System.out.println("我是圆");
    }
}
