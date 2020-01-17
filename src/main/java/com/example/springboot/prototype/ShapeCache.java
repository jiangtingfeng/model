package com.example.springboot.prototype;

import java.util.Hashtable;

/**
 * @Author: jiangtingfeng
 * @Description: 形状保存类
 * @Date :Create in 16:40 2020/1/16
 */
public class ShapeCache {

    //保存数据的表
    private static Hashtable<String,Shape> shapeHashtable
            = new Hashtable<>();
    //通过key获取相应的对象
    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cacheShape = shapeHashtable.get(shapeId);
        return  (Shape) cacheShape.clone() ;
    }
    //存储形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeHashtable.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeHashtable.put(square.getId(),square);
    }
}
