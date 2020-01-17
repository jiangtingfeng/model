package com.example.springboot.adapterModel;

/**
 * @Author: jiangtingfeng
 * @Description: 高级音频播放器
 * @Date :Create in 17:06 2020/1/16
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
