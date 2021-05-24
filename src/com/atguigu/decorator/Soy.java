package com.atguigu.decorator;

/**
 * @author ShiWei
 * @date 2021/5/24 - 19:40
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
