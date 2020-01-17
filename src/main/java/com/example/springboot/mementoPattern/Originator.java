package com.example.springboot.mementoPattern;

import lombok.Data;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:36 2020/1/17
 */
@Data
public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
