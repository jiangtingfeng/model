package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description: 全鸡
 * @Date :Create in 16:10 2020/1/16
 */
public class ChickenAll extends ChickenContant {
    @Override
    public String name() {
        return "全鸡";
    }

    @Override
    public float price() {
        return 22.0f;
    }
}
