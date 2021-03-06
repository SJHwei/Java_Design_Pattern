package com.atguigu.command;

/**
 * @author ShiWei
 * @date 2021/5/31 - 11:23
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者方法
        light.off();
    }
}
