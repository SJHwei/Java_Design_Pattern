package com.atguigu.decorator;

/**
 * @author ShiWei
 * @date 2021/5/24 - 19:18
 *
 * 单品咖啡(被装饰者类)和调味料(装饰者类)都使用Drink这个抽象类，所以才会让装饰者类对Drink类就行继承+组合的模式。
 * 继承：创建调味料对象；
 * 组合：使用被装饰者对象。
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice自己价格
        return super.getPrice() + obj.cost();
    }

    public String getDes() {
        //obj.getDes()输出被装饰者的信息
        return des + " " + getPrice() + " && " +obj.getDes();
    }
}
