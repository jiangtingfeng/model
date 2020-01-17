package com.example.springboot.componentModel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 9:55 2020/1/17
 */
@Data
public class Employee {

    private String name;
    private String dept;
    private Integer salary;
    private List<Employee> subordinates;

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept =dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee : [ name : " + name
                + ",dept : "+ dept + ",salary : "
                + salary + "]");
    }

}
