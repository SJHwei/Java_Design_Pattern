package com.atguigu.strategy.improve;

import com.atguigu.strategy.improve.Duck;

/**
 * @author ShiWei
 * @date 2021/6/5 - 19:59
 */
public class PekingDuck extends Duck {

    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
         flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }
}
