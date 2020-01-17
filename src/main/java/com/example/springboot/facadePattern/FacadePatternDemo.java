package com.example.springboot.facadePattern;

/**
 * @Author: jiangtingfeng
 * @Description:  外观模式
 * @Date :Create in 10:42 2020/1/17
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        //创建一个对外的使用对象
        ShapeMaker shapeMaker = new ShapeMaker();
        //进行使用
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
