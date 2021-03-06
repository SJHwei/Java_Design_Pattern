package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author ShiWei
 * @date 2021/5/13 - 19:45
 *
 * 将Pizza类做成抽象类
 */
public abstract class Pizza {

    protected String name; //名字

    //准备原材料，不同的披萨不一样，因此我们做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking;");
    }

    public void cut() {
        System.out.println(name + "cutting;");
    }

    public void box() {
        System.out.println(name + "boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
