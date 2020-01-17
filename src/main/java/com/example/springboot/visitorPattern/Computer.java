package com.example.springboot.visitorPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:15 2020/1/17
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accpt(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accpt(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
