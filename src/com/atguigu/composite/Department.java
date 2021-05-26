package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShiWei
 * @date 2021/5/25 - 22:14
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    //add，remove方法就不用写了，因为它是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
