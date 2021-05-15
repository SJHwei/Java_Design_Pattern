package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/15 - 20:18
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza，准备原材料");
    }
}
