package com.example.springboot.responsibilityModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:27 2020/1/17
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:"+message);
    }

}
