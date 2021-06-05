package com.atguigu.strategy.improve;



/**
 * @author ShiWei
 * @date 2021/6/5 - 19:58
 */
public class WildDuck extends Duck {

    //构造器，传入FlyBhavior的对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
