package com.atguigu.factory.factorymethod.pizzastore.order;



import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiWei
 * @date 2021/5/13 - 19:54
 */
public abstract class OrderPizza {

    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，由工厂子类完成
            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //构造器
//    public OrderPizza(SimpleFactory simpleFactory) {
//        setSimpleFactory(simpleFactory);
//    }

    //定义一个简单工厂对象
//    SimpleFactory simpleFactory;
//    Pizza pizza = null;
//    public  void setSimpleFactory(SimpleFactory simpleFactory) {
//        String orderType = ""; //用户输入的
//
//        this.simpleFactory = simpleFactory; //设置简单工厂对象
//
//        do {
//            orderType = getType();
//            pizza = this.simpleFactory.createPizza(orderType);
//
//            //输出pizza
//            if (pizza != null) { //订购成功
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else {
//                System.out.println("订购披萨失败");
//                break;
//            }
//        } while (true);
//    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
