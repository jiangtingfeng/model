package com.example.springboot.visitorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:10 2020/1/17
 */
public interface ComputerPart {
    void accpt(ComputerPartVisitor computerPartVisitor);
}
