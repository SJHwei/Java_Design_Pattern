package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author ShiWei
 * @date 2021/6/1 - 15:08
 */
public class Output {

    //学院集合
    List<College> collegeList;

    public Output(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        //从collegeList取出所有学院，Java中的List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("========" + college.getName() + "==========");
            printDepartment(college.createIterator()); //得到对应的迭代器
        }
    }

    //输出学院，输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }

    //输出学院
}
