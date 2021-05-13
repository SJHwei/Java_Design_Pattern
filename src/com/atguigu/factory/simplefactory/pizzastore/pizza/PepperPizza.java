package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/13 - 20:23
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
