package com.atguigu.factory.simplefactory.pizzastore.order;

/**
 * @author ShiWei
 * @date 2021/5/13 - 20:06
 *
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory()); //此处OrderPizza处在一个使用功能的位置，SimpleFactory处在一个创建产品的位置
//        System.out.println("~~退出程序~~");

        new OrderPizza2();
    }
}
