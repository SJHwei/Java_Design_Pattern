package com.atguigu.decorator;

/**
 * @author ShiWei
 * @date 2021/5/24 - 19:35
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
