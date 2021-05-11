package com.atguigu.singleton.type6;

/**
 * @author ShiWei
 * @date 2021/5/11 - 18:23
 */
public class SingletonTest06 {
}

/**
 * 懒汉式(线程安全，同步方法)
 */
class Singleton {
    //注意：这里使用了volatile关键字，可以让共享的变量instance，一旦有修改值，立马就刷新到了主存里面去，而且在一定程度上也可以达到同步的效果
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，同时保证了效率
    //双重检查体现在有两次判断if(instance == null)
    //首先可以解决线程安全问题
    //其次当创建对象后，不会反复执行同步代码块，执行效率不会降低
    //推荐使用该方法
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
