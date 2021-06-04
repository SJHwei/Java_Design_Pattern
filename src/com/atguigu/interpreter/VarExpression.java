package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author ShiWei
 * @date 2021/6/4 - 8:27
 *
 * 变量的解析器
 */
public class VarExpression extends Expression {

    private String key; //key=a，key=b，key=c

    public VarExpression(String key) {
        this.key = key;
    }

    //var就是{a=10，b=20}
    //interpreter根据变量名称，返回对应的值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
