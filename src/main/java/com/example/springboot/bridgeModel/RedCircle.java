package com.example.springboot.bridgeModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 17:32 2020/1/16
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCiecle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", (x,y): (" +x+","+ y +")]");
    }
}
