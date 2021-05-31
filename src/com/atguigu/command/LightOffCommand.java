package com.atguigu.command;

/**
 * @author ShiWei
 * @date 2021/5/31 - 12:42
 */
public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者方法
        light.on();
    }
}
