package com.example.springboot.adapterModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:07 2020/1/16
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc 播放器" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //todo nothing
    }
}
