package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author ShiWei
 * @date 2021/6/4 - 8:27
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left和right表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
