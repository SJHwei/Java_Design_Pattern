package com.atguigu.observer.improve;

/**
 * @author ShiWei
 * @date 2021/6/2 - 16:59
 */
public class BaiduSite implements Observer {
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
        System.out.println("百度网站");
        System.out.println("***百度网站 气温: " + temperature + "***");
        System.out.println("***百度网站 加压: " + pressure + "***");
        System.out.println("***百度网站 湿度: " + humidity + "***");
    }
}
