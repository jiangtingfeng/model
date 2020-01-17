package com.example.springboot.templatePattern;

/**
 * @Author: jiangtingfeng
 * @Description: 游戏二
 * @Date :Create in 16:04 2020/1/17
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
