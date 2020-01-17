package com.example.springboot.templatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:  抽象类  建立模板
 * @Date :Create in 15:59 2020/1/17
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play() {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
