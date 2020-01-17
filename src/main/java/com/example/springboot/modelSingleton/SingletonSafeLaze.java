package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description:  线程安全 的 懒饿汉式实现
 * @Date :Create in 11:05 2020/1/15
 */
public class SingletonSafeLaze {
    private static SingletonSafeLaze singletonSafeLaze;
    private SingletonSafeLaze(){}

    public static synchronized SingletonSafeLaze getInstance(){
        if (singletonSafeLaze == null) {
            System.out.println("安全");
            singletonSafeLaze = new SingletonSafeLaze();
        }
        return singletonSafeLaze;
    }

    public void test() {
        System.out.println("懒恶汉式,线程安全");
    }
}
