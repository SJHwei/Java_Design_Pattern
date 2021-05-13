package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/13 - 19:53
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
