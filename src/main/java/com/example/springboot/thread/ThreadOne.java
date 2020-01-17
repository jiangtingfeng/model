package com.example.springboot.thread;

import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadOne {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today);
       /* //采用newFixedThreadPool
        int threadCount = 3;
        int sum = 0;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadCount);
        for (int i=0; i<10; i++) {
            fixedThreadPool.execute(()->{
                System.out.println("ss1");
                doSomeThing();
            });
        }
        fixedThreadPool.shutdown();
        while(true) {
            if (fixedThreadPool.isTerminated()) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    private static void doSomeThing() {
        int threadCount = 3;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadCount);
        for (int j=0; j<3; j++) {
            fixedThreadPool.execute(() -> {
                System.out.println("ss2");
            });
        }
        fixedThreadPool.shutdown();
        while(true) {
            if (fixedThreadPool.isTerminated()) {
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
