package com.example.springboot.componentModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:00 2020/1/17
 */
public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("John","CEO",30000);
        Employee headSales = new Employee("Rebert","head Sales",20000);
        Employee headMarketing = new Employee("Michel","Head Marketing",20000);

        Employee clerk1 = new Employee("Laura","Marketing",10000);
        Employee clerk2 = new Employee("Bob","Marketing",10000);

        Employee salesExecutive1 = new Employee("Richard","Sales",10000);
        Employee salesExecutive2 = new Employee("Rob","Sales",10000);

        employee.add(headSales);
        employee.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(employee);
        for (Employee headEmployee : employee.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee1 : headEmployee.getSubordinates()) {
                System.out.println(employee1);
            }
        }
    }
}
