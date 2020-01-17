package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:57 2020/1/16
 */
public abstract class ChickenContant implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
