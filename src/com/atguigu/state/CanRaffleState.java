package com.atguigu.state;

import java.util.Random;

/**
 * @author ShiWei
 * @date 2021/6/4 - 20:06
 *
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%中奖率
        if (num == 0) {
            //改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
