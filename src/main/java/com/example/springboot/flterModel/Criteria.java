package com.example.springboot.flterModel;

import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:50 2020/1/16
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> peoples);
}
