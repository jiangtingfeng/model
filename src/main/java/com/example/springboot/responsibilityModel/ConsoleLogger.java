package com.example.springboot.responsibilityModel;

/**
 * @Author: jiangtingfeng
 * @Description: 日志打印
 * @Date :Create in 11:23 2020/1/17
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }

}
