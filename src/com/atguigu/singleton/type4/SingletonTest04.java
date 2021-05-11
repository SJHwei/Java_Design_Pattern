package com.atguigu.singleton.type4;

/**
 * @author ShiWei
 * @date 2021/5/11 - 18:23
 */
public class SingletonTest04 {
}

/**
 * 懒汉式(线程安全，同步方法)
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
