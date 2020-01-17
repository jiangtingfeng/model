package com.example.springboot.responsibilityModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:25 2020/1/17
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:"+message);
    }

}
