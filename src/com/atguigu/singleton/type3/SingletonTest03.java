package com.atguigu.singleton.type3;

/**
 * @author ShiWei
 * @date 2021/5/10 - 22:36
 */
public class SingletonTest03 {

}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
