package com.example.springboot.adapterModel;


/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:17 2020/1/16
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AutoPlayer audioPlayer = new AutoPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
