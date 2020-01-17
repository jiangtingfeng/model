package com.example.springboot.mediatorPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:27 2020/1/17
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(parse(new Date())
                + " [" + user.getName() +"] : " + message);
    }

    public static String parse(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }
}
