package com.atguigu.observer.improve;


/**
 * @author ShiWei
 * @date 2021/6/2 - 16:29
 *
 * 接口，让WeatherData来实现
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservsers();
}
