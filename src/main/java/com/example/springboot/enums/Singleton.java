package com.example.springboot.enums;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:43 2020/1/16
 */
public enum  Singleton {
    INSTANCE;
    public void whateverMethod() {
        System.out.println(INSTANCE);
    }
}
