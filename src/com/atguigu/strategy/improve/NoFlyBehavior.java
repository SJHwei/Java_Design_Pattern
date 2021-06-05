package com.atguigu.strategy.improve;

/**
 * @author ShiWei
 * @date 2021/6/5 - 20:44
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
