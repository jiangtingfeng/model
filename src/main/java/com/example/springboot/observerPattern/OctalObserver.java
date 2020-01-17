package com.example.springboot.observerPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:04 2020/1/17
 */
public class OctalObserver extends Observer {

    public OctalObserver (Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String : "
                        + Integer.toOctalString(subject.getState()));
    }
}
