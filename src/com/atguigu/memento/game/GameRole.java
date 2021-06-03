package com.atguigu.memento.game;

/**
 * @author ShiWei
 * @date 2021/6/3 - 20:19
 */
public class GameRole {

    private int vit;
    private int def;

    //状态Memento，即根据当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力：" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
