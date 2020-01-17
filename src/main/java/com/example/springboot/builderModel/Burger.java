package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:  提供汉堡的默认功能
 * @Date :Create in 13:39 2020/1/16
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
