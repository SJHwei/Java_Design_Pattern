package com.atguigu.singleton.type7;

/**
 * @author ShiWei
 * @date 2021/5/11 - 18:23
 */
public class SingletonTest07 {
}

/**
 * 静态内部类完成，推荐使用
 */
class Singleton {

    //构造器私有化
    private Singleton() {
    }

    //写一个静态内部类，该类中有一个静态属性：INSTANCE
    public static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
