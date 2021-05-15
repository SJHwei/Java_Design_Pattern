package com.atguigu.factory.absfactory.pizzastore.order;

/**
 * @author ShiWei
 * @date 2021/5/15 - 21:31
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
