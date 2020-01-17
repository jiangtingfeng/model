package com.example.springboot.statePattern;

/**
 * @Author: jiangtingfeng
 * @Description:  状态模式
 * @Date :Create in 15:24 2020/1/17
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString() {
        return "Start State";
    }
}
