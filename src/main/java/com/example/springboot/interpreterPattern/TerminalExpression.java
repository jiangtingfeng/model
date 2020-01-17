package com.example.springboot.interpreterPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 13:37 2020/1/17
 */
public class TerminalExpression implements Expression {

    private String data;

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

    public TerminalExpression(String data) {
        this.data = data;
    }
}
