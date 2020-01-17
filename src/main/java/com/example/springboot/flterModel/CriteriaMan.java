package com.example.springboot.flterModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:56 2020/1/16
 */
public class CriteriaMan implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> peopleManList = new ArrayList<>();
        peoples.forEach(people->{
            if (people.getGender().equalsIgnoreCase("MALE")) {
                peopleManList.add(people);
            }
        });
        return peopleManList;
    }
}
