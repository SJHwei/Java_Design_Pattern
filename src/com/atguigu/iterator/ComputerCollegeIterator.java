package com.atguigu.iterator;

import javax.swing.text.Position;
import java.util.Iterator;

/**
 * @author ShiWei
 * @date 2021/6/1 - 14:38
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎么样的方式存放 => 数组
    Department[] departments;
    int postion = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if (postion >= departments.length || departments[postion] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[postion];
        postion++;
        return department;
    }

    /**
     * 删除的方法默认空实现
     */
    @Override
    public void remove() {

    }
}
