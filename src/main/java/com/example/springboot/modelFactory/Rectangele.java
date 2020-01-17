package com.example.springboot.modelFactory;

/**
 * @Author: jiangtingfeng
 * @Description:  矩形
 * @Date :Create in 9:43 2020/1/15
 */
public class Rectangele implements Shape {

    /*
    * 实现继承接口的方法
    * */
    @Override
    public void draw() {
        System.out.println("我是矩形");
    }
}
