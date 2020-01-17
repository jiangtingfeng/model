package com.example.springboot.modelSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:48 2020/1/15
 */
public class VolatileTest {
    volatile static boolean toop = false;
    public void run() {
        System.out.println(1);
    }
    public void tellMeToStop() {
        toop  = true;
    }


    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i=0; i<3; i++) {
            pool.execute(()->{
                VolatileTest volatileTest = new VolatileTest();
                volatileTest.run();
                toop = true;
            });
        }
        pool.shutdown();
        while (true) {
            if (pool.isTerminated()) {
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
