package com.example.springboot.mementoPattern;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:35 2020/1/17
 */
@Data
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }


}
