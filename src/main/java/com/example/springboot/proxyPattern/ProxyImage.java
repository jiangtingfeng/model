package com.example.springboot.proxyPattern;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 11:08 2020/1/17
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
