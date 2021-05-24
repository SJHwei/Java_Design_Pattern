package com.atguigu.decorator;

/**
 * @author ShiWei
 * @date 2021/5/24 - 19:42
 */
public class CoffeeBar {

    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力 + 一份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述1=" + order.getDes());

        //2.order加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶 费用2=" + order.cost());
        System.out.println("order加入一份牛奶 描述2=" + order.getDes());

        //3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶，加入一份巧克力 费用3=" + order.cost());
        System.out.println("order加入一份牛奶，加入一份巧克力 描述3=" + order.getDes());

        //3.order又加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶，加入二份巧克力 费用4=" + order.cost());
        System.out.println("order加入一份牛奶，加入二份巧克力 描述4=" + order.getDes());
    }
}
