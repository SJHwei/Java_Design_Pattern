package com.atguigu.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ShiWei
 * @date 2021/6/1 - 9:59
 *
 * 数据结构，管理很多人(Man，Woman)
 */
public class ObjectStructure {

    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attach(Person person) {
        persons.add(person);
    }

    //移除
    public void detach(Person person) {
        persons.remove(person);
    }

    //显示测评情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
