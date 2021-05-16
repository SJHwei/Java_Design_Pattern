package com.atguigu.prototype.improve;

/**
 * @author ShiWei
 * @date 2021/5/16 - 18:57
 */
public class Client {

    public static void main(String[] args) {
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep1 = (Sheep) sheep.clone(); //克隆
        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆
        Sheep sheep6 = (Sheep) sheep.clone(); //克隆
        Sheep sheep7 = (Sheep) sheep.clone(); //克隆
        Sheep sheep8 = (Sheep) sheep.clone(); //克隆
        Sheep sheep9 = (Sheep) sheep.clone(); //克隆
        Sheep sheep10 = (Sheep) sheep.clone(); //克隆
    }
}
