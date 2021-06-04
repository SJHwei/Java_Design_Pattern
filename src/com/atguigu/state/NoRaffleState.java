package com.atguigu.state;

/**
 * @author ShiWei
 * @date 2021/6/4 - 20:06
 *
 * 不能抽奖状态
 */
public class NoRaffleState extends State {

    //初始化时传入引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后，将状态设置为可以抽奖状态
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    public boolean raffle(){
        System.out.println("扣了才能抽奖喔！");
        return false;
    }

    //当前状态不能法奖品
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
