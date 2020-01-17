package com.example.springboot.businessDelegatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:51 2020/1/17
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

}
