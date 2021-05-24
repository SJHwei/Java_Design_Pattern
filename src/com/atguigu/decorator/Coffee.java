package com.atguigu.decorator;

/**
 * @author ShiWei
 * @date 2021/5/24 - 18:45
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
