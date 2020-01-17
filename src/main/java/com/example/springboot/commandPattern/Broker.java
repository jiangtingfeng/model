package com.example.springboot.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:45 2020/1/17
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order:orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
