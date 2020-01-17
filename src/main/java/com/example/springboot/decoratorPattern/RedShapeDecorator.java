package com.example.springboot.decoratorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:21 2020/1/17
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        if (decoratedShape instanceof Circle) {
            decoratedShape.draw();
            setRedBorderRed(decoratedShape);
        } else {
            decoratedShape.draw();
            setRedBorderBlack(decoratedShape);
        }
    }

    private void setRedBorderBlack(Shape decoratedShape) {
        System.out.println("Border color : black");
    }

    private void setRedBorderRed(Shape decoratedShape) {
        System.out.println("Border color : Red");
    }
}
