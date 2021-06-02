package com.atguigu.observer.improve;

import com.atguigu.observer.CurrentConditons;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author ShiWei
 * @date 2021/6/2 - 15:34
 *
 * 核心类：
 * 1. 包含最新的天气情况信息；
 * 2. 含有观察者集合，使用ArrayList管理；
 * 3. 当数据有更新时，就主动调用ArrayList，通知所有的接入方就看到最新的信息
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObservsers();
    }

    /**
     * 当数据有更新时，就调用setData
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新信息推送给所有观察者
        dataChange();
    }

    /**
     * 注册一个观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除一个观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    /**
     * 遍历所有的观察者，并通知
     */
    @Override
    public void notifyObservsers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
