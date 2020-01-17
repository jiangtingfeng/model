package com.example.springboot.bridgeModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:38 2020/1/16
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
