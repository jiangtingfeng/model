package com.example.springboot.commandPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:41 2020/1/17
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
