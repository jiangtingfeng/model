package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description: 等级式/静态内部类
 * @Date :Create in 11:27 2020/1/16
 */
public class SingletonInner {

    //静态内部类
    private static class SingletonHolder {
        private static final SingletonInner instance = new SingletonInner() ;
    }
    private SingletonInner(){}
    public static final SingletonInner getInstance() {
        System.out.println(1);
        return SingletonHolder.instance;
    }

}
