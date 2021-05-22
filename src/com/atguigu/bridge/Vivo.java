package com.atguigu.bridge;

/**
 * @author ShiWei
 * @date 2021/5/22 - 18:56
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
