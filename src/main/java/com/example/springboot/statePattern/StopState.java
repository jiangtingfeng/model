package com.example.springboot.statePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:26 2020/1/17
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }

}
