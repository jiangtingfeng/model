package com.example.springboot.modelFactory;

/**
 * @Author: jiangtingfeng
 * @Description:  正方形
 * @Date :Create in 9:45 2020/1/15
 */
public class Square implements Shape {
    /*
    * 实现继承的接口方法
    * */
    @Override
    public void draw() {
        System.out.println("我是正方形");
    }
}
