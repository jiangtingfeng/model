package com.example.springboot.statePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:27 2020/1/17
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
