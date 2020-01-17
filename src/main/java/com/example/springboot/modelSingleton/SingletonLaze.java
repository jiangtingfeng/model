package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description: 懒饿汉模式  线程不安全  多线程下不行正常运行
 * @Date :Create in 11:01 2020/1/15
 */
public class SingletonLaze {

    private static SingletonLaze instance;
    private SingletonLaze(){}
    public static SingletonLaze getInstance() {
        if (instance == null) {
            System.out.println("不安全");
            instance = new SingletonLaze();
        }
        return instance;
    }
    public void test(){
        System.out.println("懒恶汉式,线程不安全");
    }
}
