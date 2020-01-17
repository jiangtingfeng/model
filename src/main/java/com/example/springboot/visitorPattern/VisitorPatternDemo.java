package com.example.springboot.visitorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:16 2020/1/17
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accpt(new ComputerPartDisplayVisitor());
    }

}
