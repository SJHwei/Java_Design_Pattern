package com.atguigu.bridge;

/**
 * @author ShiWei
 * @date 2021/5/22 - 19:03
 */
public class FolderPhone extends Phone {

    //构造器
    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
