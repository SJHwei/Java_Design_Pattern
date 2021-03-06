package com.atguigu.observer;

/**
 * @author ShiWei
 * @date 2021/6/2 - 15:30
 *
 * 显示当前天气情况（可以理解成是气象站自己的网站）
 */
public class CurrentConditons {
    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气情况，是由WeatherData来调用，使用推送模式
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}
