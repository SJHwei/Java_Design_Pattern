package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 21:12
 *
 * 一个抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
