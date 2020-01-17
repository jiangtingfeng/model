package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description:  单例模式
 * @Date :Create in 10:54 2020/1/15
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();
    /*
    * 构造函数私有化
    * */
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("我是单例模式");
    }
}
