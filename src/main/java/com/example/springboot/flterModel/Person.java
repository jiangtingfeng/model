package com.example.springboot.flterModel;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:50 2020/1/16
 */
@Data
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
    public Person(){}
    public Person(String name,String gender,String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
