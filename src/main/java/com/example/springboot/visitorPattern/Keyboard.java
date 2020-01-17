package com.example.springboot.visitorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:13 2020/1/17
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accpt(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
