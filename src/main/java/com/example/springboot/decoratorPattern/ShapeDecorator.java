package com.example.springboot.decoratorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:18 2020/1/17
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
