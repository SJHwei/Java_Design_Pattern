package com.atguigu.state;

/**
 * @author ShiWei
 * @date 2021/6/4 - 20:06
 *
 * 奖品发放完毕状态
 * 说明：当我们activity改变成DispenseOutState，抽奖活动结束
 */
public class DispenseOutState extends State {

    //初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
