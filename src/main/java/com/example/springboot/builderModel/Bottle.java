package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 13:37 2020/1/16
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
