package com.example.springboot.facadePattern;

/**
 * @Author: jiangtingfeng
 * @Description:  创建一个外观  这个包含着  三个不同形状的对象
 * @Date :Create in 10:38 2020/1/17
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

