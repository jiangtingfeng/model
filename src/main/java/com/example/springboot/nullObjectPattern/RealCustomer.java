package com.example.springboot.nullObjectPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:38 2020/1/17
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
