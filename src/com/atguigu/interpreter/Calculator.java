package com.atguigu.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author ShiWei
 * @date 2021/6/4 - 8:28
 */
public class Calculator {

    //定义表达式
    private Expression expression;

    //构造函数传参，并解析
    public Calculator(String expStr) {
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个charArray数组后，就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b和var={a=10，b=20}
        //然后传递给expression的interpreter进行解析执行
        return this.expression.interpreter(var);
    }
}
