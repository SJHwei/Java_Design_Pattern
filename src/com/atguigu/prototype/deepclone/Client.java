package com.atguigu.prototype.deepclone;

/**
 * @author ShiWei
 * @date 2021/5/16 - 21:20
 */
public class Client {

    public static void main(String[] args) throws Exception {

        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1完成深拷贝
//        DeepProtoType p1 = (DeepProtoType) p.clone();
//
//        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//        System.out.println("p1.name=" + p1.name + "p1.deepCloneableTarget=" + p1.deepCloneableTarget.hashCode());

        //方式2完成深拷贝
        DeepProtoType p1 = (DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p1.name=" + p1.name + "p1.deepCloneableTarget=" + p1.deepCloneableTarget.hashCode());

    }
}
