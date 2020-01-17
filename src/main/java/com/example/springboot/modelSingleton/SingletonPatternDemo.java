package com.example.springboot.modelSingleton;

import java.util.concurrent.*;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:59 2020/1/15
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        /*
        获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        显示消息
        object.showMessage();
        多线程使用构建10线程的线程池
         */
        test();
        test1();
    }

    private static void test1() {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i=0; i<10; i++) {
            pool.execute(()->{
                SingletonLaze.getInstance();
            });
        }
        pool.shutdown();
        while (true) {
            if (pool.isTerminated()) {
                System.out.println("任务执行完");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void test() {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i=0; i<10; i++) {
            pool.execute(()->{
               SingletonSafeLaze.getInstance();
            });
        }
        pool.shutdown();
        while (true) {
            if (pool.isTerminated()) {
                System.out.println("任务执行完");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
