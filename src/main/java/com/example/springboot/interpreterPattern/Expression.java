package com.example.springboot.interpreterPattern;

/**
 * @Author: jiangtingfeng
 * @Description:  解释器模式
 * @Date :Create in 13:35 2020/1/17
 */
public interface Expression {

    boolean interpret(String context);

}
