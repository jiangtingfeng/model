package com.example.springboot.prototype;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:38 2020/1/16
 */
public class Circle extends Shape {

    public Circle() {
        type = "圆";
    }
    @Override
    void draw() {
        System.out.println("我是圆");
    }
}
