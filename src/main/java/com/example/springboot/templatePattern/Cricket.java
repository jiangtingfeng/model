package com.example.springboot.templatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:   游戏一
 * @Date :Create in 16:01 2020/1/17
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game");
    }
}
