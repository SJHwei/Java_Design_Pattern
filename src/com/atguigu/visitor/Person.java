package com.atguigu.visitor;

/**
 * @author ShiWei
 * @date 2021/6/1 - 9:47
 */
public abstract class Person {

    //调用一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
