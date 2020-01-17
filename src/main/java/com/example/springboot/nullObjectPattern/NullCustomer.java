package com.example.springboot.nullObjectPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:41 2020/1/17
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

}
