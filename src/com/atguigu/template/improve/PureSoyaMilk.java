package com.atguigu.template.improve;

/**
 * @author ShiWei
 * @date 2021/5/31 - 10:18
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
