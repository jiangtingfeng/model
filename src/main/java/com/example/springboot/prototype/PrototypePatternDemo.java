package com.example.springboot.prototype;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:48 2020/1/16
 */
public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        //建立保存数据库的表
        ShapeCache.loadCache();
        //通过key获取相应的对象
        Shape shape = ShapeCache.getShape("1");
        System.out.println("shape:" + shape.getType());
    }
}
