package com.atguigu.mediator;

/**
 * @author ShiWei
 * @date 2021/6/3 - 9:07
 *
 *
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void register(String name, Colleague colleague);

    //接收消息，具体的同事对象发出
    public abstract void getMessage(int stateChange, String name);

    public abstract void sendMessage();
}
