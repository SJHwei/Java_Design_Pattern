package com.atguigu.factory.absfactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 20:18
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪pizza，准备原材料");
    }
}
