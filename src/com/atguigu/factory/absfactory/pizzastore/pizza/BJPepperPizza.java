package com.atguigu.factory.absfactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 20:18
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza，准备原材料");
    }
}
