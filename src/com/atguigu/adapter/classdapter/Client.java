package com.atguigu.adapter.classdapter;

/**
 * @author ShiWei
 * @date 2021/5/19 - 20:14
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("==== 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
