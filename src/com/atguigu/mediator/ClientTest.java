package com.atguigu.mediator;

import com.atguigu.decorator.Coffee;

/**
 * @author ShiWei
 * @date 2021/6/3 - 9:44
 */
public class ClientTest {

    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm并且加入到ConcreteMediator对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine对象并且加入到ConcreteMediator对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建Curtains，并且加入到ConcreteMediator对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");

        TV tv = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
