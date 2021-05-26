package com.atguigu.composite;

/**
 * @author ShiWei
 * @date 2021/5/25 - 21:39
 */
public abstract class OrganizationComponent {

    private String name; //名字
    private String des; //说明

    //注意：对于add和remove方法，由于叶子节点不需要自己实现，所以此处提供默认实现，不设置为抽象方法

    protected void add(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    //构造方法
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //方法print，做成抽象的，子类都需要实现
    protected abstract void print();
}
