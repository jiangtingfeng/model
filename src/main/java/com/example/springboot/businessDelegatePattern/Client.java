package com.example.springboot.businessDelegatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:52 2020/1/17
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}
