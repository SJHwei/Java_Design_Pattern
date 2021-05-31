package com.atguigu.template;

/**
 * @author ShiWei
 * @date 2021/5/30 - 20:30
 */
public class Client {

    public static void main(String[] args) {

        //制作红豆豆浆
        System.out.println("----制作红豆豆浆----");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        //制作花生豆浆
        System.out.println("----制作花生豆浆----");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
