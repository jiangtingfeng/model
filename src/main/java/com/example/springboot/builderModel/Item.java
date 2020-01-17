package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description: 食物条目和食物包装的接口
 * @Date :Create in 13:34 2020/1/16
 */
public interface Item {
     String name();
     Packing packing();
     float price();
}
