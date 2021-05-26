package com.atguigu.facade;

/**
 * @author ShiWei
 * @date 2021/5/26 - 20:05
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector is focus");
    }
}
