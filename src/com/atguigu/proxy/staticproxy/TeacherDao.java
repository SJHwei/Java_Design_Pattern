package com.atguigu.proxy.staticproxy;

/**
 * @author ShiWei
 * @date 2021/5/28 - 19:58
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
