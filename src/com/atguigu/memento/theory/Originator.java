package com.atguigu.memento.theory;

/**
 * @author ShiWei
 * @date 2021/6/3 - 19:08
 */
public class Originator {

    private  String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象Memento
    //因此编写一个方法，返回Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
