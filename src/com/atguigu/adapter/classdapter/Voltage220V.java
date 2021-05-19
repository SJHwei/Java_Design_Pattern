package com.atguigu.adapter.classdapter;

/**
 * @author ShiWei
 * @date 2021/5/19 - 20:05
 *
 * 被适配的类
 */
public class Voltage220V {

    /**
     * 输出220V的电压
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
