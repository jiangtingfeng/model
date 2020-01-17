package com.example.springboot.modelFactory.modelFactoryTwo;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:01 2020/1/15
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("我是红色");
    }
}
