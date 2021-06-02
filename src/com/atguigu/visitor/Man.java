package com.atguigu.visitor;

/**
 * @author ShiWei
 * @date 2021/6/1 - 9:47
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
