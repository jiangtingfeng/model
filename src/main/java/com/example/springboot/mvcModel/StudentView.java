package com.example.springboot.mvcModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:27 2020/1/17
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
