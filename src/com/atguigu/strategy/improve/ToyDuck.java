package com.atguigu.strategy.improve;


/**
 * @author ShiWei
 * @date 2021/6/5 - 20:01
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }

    //需要重写父类的所有方法

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
