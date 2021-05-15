package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 20:44
 */
public class PizzaStore {

    public static void main(String[] args) {

        //创建北京口味的各种Pizza
        new BJOrderPizza();
    }
}
