package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description: 鸡胸肉
 * @Date :Create in 16:09 2020/1/16
 */
public class ChickenMeat extends ChickenContant {
    @Override
    public String name() {
        return "鸡胸肉";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
