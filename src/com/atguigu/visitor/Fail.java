package com.atguigu.visitor;

/**
 * @author ShiWei
 * @date 2021/6/1 - 9:51
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价是该歌手失败！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价是该歌手失败！");
    }
}
