package com.example.springboot.bridgeModel;

/**
 * @Author: jiangtingfeng
 * @Description: 实现抽象形状类
 * @Date :Create in 17:36 2020/1/16
 */
public class Circle extends Shape {

    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCiecle(radius,x,y);
    }
}
