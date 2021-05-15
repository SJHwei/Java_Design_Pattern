package com.atguigu.factory.absfactory.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 20:18
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪pizza，准备原材料");
    }
}
