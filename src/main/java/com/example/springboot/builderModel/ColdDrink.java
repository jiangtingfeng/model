package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:  提供冷饮的默认功能
 * @Date :Create in 13:43 2020/1/16
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
