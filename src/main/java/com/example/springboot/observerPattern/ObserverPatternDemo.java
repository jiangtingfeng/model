package com.example.springboot.observerPattern;

/**
 * @Author: jiangtingfeng
 * @Description:  观察者模式 --------------------
 * @Date :Create in 15:08 2020/1/17
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change:10");
        subject.setState(10);
    }
}
