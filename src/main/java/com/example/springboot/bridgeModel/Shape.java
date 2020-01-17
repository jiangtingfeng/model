package com.example.springboot.bridgeModel;

/**
 * @Author: jiangtingfeng
 * @Description:  抽象方法  画形状  包含了画圆的接口
 * @Date :Create in 17:34 2020/1/16
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
