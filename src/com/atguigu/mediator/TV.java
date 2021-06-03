package com.atguigu.mediator;

/**
 * @author ShiWei
 * @date 2021/6/3 - 9:36
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("It's time to StartTv!");
    }

    public void stopTv() {
        System.out.println("Stop TV!");
    }
}
