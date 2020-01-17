package com.example.springboot.flterModel;

import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:54 2020/1/16
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(peoples);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}
