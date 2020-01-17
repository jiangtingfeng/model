package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description: 香辣鸡翅
 * @Date :Create in 16:07 2020/1/16
 */
public class ChickenTeg extends ChickenContant {

    @Override
    public String name() {
        return "香辣鸡翅";
    }

    @Override
    public float price() {
        return 8.0f;
    }

}
