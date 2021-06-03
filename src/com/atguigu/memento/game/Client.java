package com.atguigu.memento.game;

/**
 * @author ShiWei
 * @date 2021/6/3 - 20:29
 */
public class Client {

    public static void main(String[] args) {

        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和Boss大战前的状态");
        gameRole.display();

        //把当前状态保存在CareTaker中
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(gameRole.createMemento());

        System.out.println("和Boss大战~~");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("大战后使用备忘录对象恢复到大战前的状态");

        gameRole.recoverRoleFromMemento(careTaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
