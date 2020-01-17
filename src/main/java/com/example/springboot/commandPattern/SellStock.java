package com.example.springboot.commandPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:43 2020/1/17
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}
