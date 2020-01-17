package com.example.springboot.observerPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:53 2020/1/17
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
