package com.example.springboot.businessDelegatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:52 2020/1/17
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }

}
