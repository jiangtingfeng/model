package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 13:46 2020/1/16
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "肌肉堡";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
