package com.atguigu.strategy;

/**
 * @author ShiWei
 * @date 2021/6/5 - 19:59
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
