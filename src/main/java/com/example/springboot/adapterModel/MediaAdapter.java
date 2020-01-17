package com.example.springboot.adapterModel;

import javax.print.attribute.standard.Media;

/**
 * @Author: jiangtingfeng
 * @Description:  实现MediaPlayer的  适配器
 * @Date :Create in 17:10 2020/1/16
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer = null;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
