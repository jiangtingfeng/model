package com.example.springboot.prototype;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:35 2020/1/16
 */
public class Rectangle extends Shape {

    /* 初始化的时候可进行简单的赋值操作
    * */
    public Rectangle() {
        type = "长方形";
    }

    @Override
    void draw() {
        System.out.println("我是正方形");
    }
}
