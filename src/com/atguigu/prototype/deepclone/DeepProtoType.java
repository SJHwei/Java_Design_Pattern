package com.atguigu.prototype.deepclone;

import java.io.*;

/**
 * @author ShiWei
 * @date 2021/5/16 - 21:10
 */
public class DeepProtoType implements Serializable, Cloneable {

    public String name; //String类型的属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepProtoType() {
        super();
    }

    /**
     * 深拷贝-方式1：使用clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //这里完成对基本数据类型(属性)和String类型的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    /**
     * 深拷贝-方式2：通过对象的序列化实现（推荐）
     */
    public Object deepClone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
