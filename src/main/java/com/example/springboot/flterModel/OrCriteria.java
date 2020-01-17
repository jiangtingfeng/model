package com.example.springboot.flterModel;

import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 9:32 2020/1/17
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(peoples);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(peoples);

        for (Person person:otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }

}
