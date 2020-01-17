package com.example.springboot.commandPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:38 2020/1/17
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ name: " + name +"," +
                "Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + "," +
                "Quantity: " + quantity +" ] sold");
    }
}
