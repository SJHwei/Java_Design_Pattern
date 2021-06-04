package com.atguigu.state;

/**
 * @author ShiWei
 * @date 2021/6/4 - 20:07
 */
public class ClientTest {

    public static void main(String[] args) {

        //创建活动，奖品池有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        //我们连续抽三百次奖
        for (int i = 0; i < 3; i++) {
            System.out.println("------------第" + (i + 1) + "次抽奖--------------");
            //参加抽奖
            //第一步：扣除积分
            activity.deductMoney();
            //第二步：抽奖
            activity.raffle();
        }
    }
}
