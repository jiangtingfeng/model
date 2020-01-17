package com.example.springboot.modelSingleton;

/**
 * @Author: jiangtingfeng
 * @Description:  双检锁  // 双重校验锁   在多线程运行是具有较高的性能
 * @Date :Create in 11:38 2020/1/15
 */
public class SingletonLock {
    //volatile让变量每次在使用的时候，都从主存中取。而不是从各个线程的“工作内存”。
    //volatile具有synchronized关键字的“可见性”，但是没有synchronized关键字的“并发正确性”，也就是说不保证线程执行的有序性。
    //也就是说，volatile变量对于每次使用，线程都能得到当前volatile变量的最新值。但是volatile变量并不保证并发的正确性

    private volatile static SingletonLock singletonLock;
    private SingletonLock(){}
    public static SingletonLock getSingletonLock() {
        if (singletonLock == null) {
            synchronized (SingletonLock.class) {
                if (singletonLock == null) {
                    singletonLock = new SingletonLock();
                }
            }
        }
        return singletonLock;
    }
}
