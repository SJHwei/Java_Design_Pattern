package com.atguigu.visitor;

/**
 * @author ShiWei
 * @date 2021/6/1 - 9:43
 */
public abstract class Action {

    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女性的测评
    public abstract void getWomanResult(Woman woman);
}
