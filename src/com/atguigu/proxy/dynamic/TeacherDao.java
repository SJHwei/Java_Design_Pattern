package com.atguigu.proxy.dynamic;

/**
 * @author ShiWei
 * @date 2021/5/28 - 20:22
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
