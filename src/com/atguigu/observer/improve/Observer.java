package com.atguigu.observer.improve;

/**
 * @author ShiWei
 * @date 2021/6/2 - 16:31
 *
 * 观察者接口，有观察者来实现
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
