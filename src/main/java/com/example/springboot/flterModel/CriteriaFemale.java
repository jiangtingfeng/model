package com.example.springboot.flterModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 18:00 2020/1/16
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> personFemanList = new ArrayList<>();
        peoples.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                personFemanList.add(person);
            }
        });
        return personFemanList;
    }
}
