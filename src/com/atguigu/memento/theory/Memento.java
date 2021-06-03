package com.atguigu.memento.theory;

/**
 * @author ShiWei
 * @date 2021/6/3 - 19:11
 */
public class Memento {

    private String state;

    //构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
