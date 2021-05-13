package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/13 - 19:52
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
