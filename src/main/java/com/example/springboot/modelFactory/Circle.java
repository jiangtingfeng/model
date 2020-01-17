package com.example.springboot.modelFactory;

/**
 * @Author: jiangtingfeng
 * @Description:  圆
 * @Date :Create in 9:46 2020/1/15
 */
public class Circle implements Shape{
    /*
    *实现继承接口的方法
    *  */
    @Override
    public void draw() {
        System.out.println("我是圆");
    }
}
