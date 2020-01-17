package com.example.springboot.visitorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:14 2020/1/17
 */
public class Monitor implements ComputerPart {
    @Override
    public void accpt(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
