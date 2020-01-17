package com.example.springboot.observerPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:01 2020/1/17
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String : "
        + Integer.toBinaryString(subject.getState()));
    }

}
