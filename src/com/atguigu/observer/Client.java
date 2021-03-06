package com.atguigu.observer;

/**
 * @author ShiWei
 * @date 2021/6/2 - 16:02
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方currentConditions
        CurrentConditons currentConditons = new CurrentConditons();
        //创建WeatherData并将接入方currentConditions传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditons);
        //更新天气情况
        weatherData.setData(30, 150, 40);
        //天气情况变化
        System.out.println("=============天气情况变化==============");
        weatherData.setData(40, 160, 20);
    }
}
