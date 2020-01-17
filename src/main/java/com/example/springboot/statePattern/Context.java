package com.example.springboot.statePattern;


/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:21 2020/1/17
 */
public class Context {

    private State state;
    public Context() {
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
}
