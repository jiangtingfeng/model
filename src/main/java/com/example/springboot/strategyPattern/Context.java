package com.example.springboot.strategyPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:54 2020/1/17
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
