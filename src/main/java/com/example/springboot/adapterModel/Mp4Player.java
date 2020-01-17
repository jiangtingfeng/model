package com.example.springboot.adapterModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:09 2020/1/16
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // todo nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4:" + fileName);
    }

}
