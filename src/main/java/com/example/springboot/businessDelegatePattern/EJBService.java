package com.example.springboot.businessDelegatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:49 2020/1/17
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
