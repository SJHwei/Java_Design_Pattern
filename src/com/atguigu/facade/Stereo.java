package com.atguigu.facade;

/**
 * @author ShiWei
 * @date 2021/5/26 - 20:08
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void up() {
        System.out.println("Stereo up");
    }
}
