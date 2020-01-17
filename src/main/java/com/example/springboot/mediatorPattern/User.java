package com.example.springboot.mediatorPattern;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:27 2020/1/17
 */
@Data
public class User {

    private String name;

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
