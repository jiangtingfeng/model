package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:05 2020/1/16
 */
public class ChickenLeg extends ChickenContant {

    @Override
    public String name() {
        return "香辣鸡腿";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
