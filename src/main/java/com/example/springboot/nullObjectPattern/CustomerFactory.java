package com.example.springboot.nullObjectPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:42 2020/1/17
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
