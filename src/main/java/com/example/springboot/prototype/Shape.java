package com.example.springboot.prototype;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:31 2020/1/16
 */
@Data
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }
}
