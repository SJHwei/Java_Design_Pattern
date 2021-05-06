package com.atguigu.principle.inversion.improve;

/**
 * @author ShiWei
 * @date 2021/5/6 - 19:56
 */
public class DependencyInversion {

    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }

}

//定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：hello world！";
    }
}

//增加微信
class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息：hello ok！";
    }
}

//方式2
class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}