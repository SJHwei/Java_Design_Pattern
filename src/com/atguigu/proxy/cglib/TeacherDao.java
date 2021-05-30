package com.atguigu.proxy.cglib;

/**
 * @author ShiWei
 * @date 2021/5/29 - 19:21
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中，我是cglib代理，不需要实现接口");
        return "hello";
    }
}
