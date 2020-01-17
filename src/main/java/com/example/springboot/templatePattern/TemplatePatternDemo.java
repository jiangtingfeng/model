package com.example.springboot.templatePattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 16:05 2020/1/17
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
