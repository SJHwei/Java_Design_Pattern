package com.atguigu.template.improve;

/**
 * @author ShiWei
 * @date 2021/5/30 - 20:30
 */
public class Client {

    public static void main(String[] args) {

        //制作红豆豆浆
        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        //制作花生豆浆
        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        //制作纯豆浆
        System.out.println("----制作纯豆浆----");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
