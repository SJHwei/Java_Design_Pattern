package com.atguigu.observer;

/**
 * @author ShiWei
 * @date 2021/6/2 - 15:34
 *
 * 核心类：
 * 1. 包含最新的天气情况信息；
 * 2. 含有CurrentConditions对象；
 * 3. 当数据有更新时，就主动调用CurrentConditions对象的update方法(含有display)，这样他们(接入方)就看到最新的信息
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditons currentConditons;

    public WeatherData(CurrentConditons currentConditons) {
        this.currentConditons = currentConditons;
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
        //调用接入方的update方法
        currentConditons.update(getTemperature(), getPressure(), getHumidity());
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
        //调用dataChange，将最新信息推送给接入方currentConditions
        dataChange();
    }
}
