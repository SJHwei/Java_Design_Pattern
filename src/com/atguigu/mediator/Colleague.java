package com.atguigu.mediator;

/**
 * @author ShiWei
 * @date 2021/6/3 - 9:06
 *
 * 同事抽象类
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
