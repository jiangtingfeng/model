package com.example.springboot.strategyPattern;

/**
 * @Author: jiangtingfeng
 * @Description: 减法
 * @Date :Create in 15:53 2020/1/17
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
