package com.atguigu.mediator;

/**
 * @author ShiWei
 * @date 2021/6/3 - 9:15
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void upCurtains() {
        System.out.println("I am holding up curtains!");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
