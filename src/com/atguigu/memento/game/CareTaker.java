package com.atguigu.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ShiWei
 * @date 2021/6/3 - 20:14
 *
 * 守护者对象，保存游戏角色的状态
 */
public class CareTaker {

    //如果只保存一次状态，则只保存一个引用
    private Memento memento;
    //如果保存多次状态，则保存一个集合
    //private ArrayList<Memento> mementos;
    //如果对多个游戏角色保存多次状态，则保存一个Map
    //private HashMap<String, ArrayList<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
