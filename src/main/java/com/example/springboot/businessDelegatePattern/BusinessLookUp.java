package com.example.springboot.businessDelegatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:51 2020/1/17
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }

}
