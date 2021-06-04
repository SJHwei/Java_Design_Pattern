package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author ShiWei
 * @date 2021/6/4 - 8:26
 *
 * 加法解析器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    //var仍然是{a=10，b=20}
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var)：返回left表达式对应的值a=10
        //super.right.interpreter(var)：返回right表达式对应的值b=20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
