package com.example.springboot.flterModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 18:03 2020/1/16
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> personSingleList = new ArrayList<>();
        peoples.forEach(person -> {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                personSingleList.add(person);
            }
        });
        return personSingleList;
    }
}
