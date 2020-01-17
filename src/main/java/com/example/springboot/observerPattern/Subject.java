package com.example.springboot.observerPattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:52 2020/1/17
 */
@Data
public class Subject {

    private List<Observer>  observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
