package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:40 2020/1/16
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonInner singletonInner = SingletonInner.getInstance();
    }
}
