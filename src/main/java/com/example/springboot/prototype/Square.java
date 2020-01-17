package com.example.springboot.prototype;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:37 2020/1/16
 */
public class Square extends Shape {
    public Square() {
        type = "正方形";
    }
    @Override
    void draw() {
        System.out.println("我是正方形");
    }
}
