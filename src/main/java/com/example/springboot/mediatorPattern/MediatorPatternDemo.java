package com.example.springboot.mediatorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:28 2020/1/17
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
