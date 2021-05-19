package com.atguigu.adapter.interfaceadapter;

/**
 * @author ShiWei
 * @date 2021/5/19 - 21:29
 */
public class Client {

    public static void main(String[] args) {

        //使用匿名内部类的方式
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们需要使用的接口方法
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };

        absAdapter.m1();
    }
}
