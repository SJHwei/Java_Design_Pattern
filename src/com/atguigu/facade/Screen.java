package com.atguigu.facade;

/**
 * @author ShiWei
 * @date 2021/5/26 - 20:07
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }
}
