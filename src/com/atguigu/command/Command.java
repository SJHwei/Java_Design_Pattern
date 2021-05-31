package com.atguigu.command;

/**
 * @author ShiWei
 * @date 2021/5/31 - 11:20
 *
 * 创建命令接口
 */
public interface Command {

    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
