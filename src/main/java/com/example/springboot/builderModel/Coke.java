package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 13:48 2020/1/16
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
