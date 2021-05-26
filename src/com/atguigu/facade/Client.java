package com.atguigu.facade;

/**
 * @author ShiWei
 * @date 2021/5/26 - 20:12
 */
public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
