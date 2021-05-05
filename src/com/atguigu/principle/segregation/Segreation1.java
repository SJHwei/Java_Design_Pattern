package com.atguigu.principle.segregation;

/**
 * @author ShiWei
 * @date 2021/5/3 - 21:04
 */
public class Segreation1 {

}

interface Interface {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface {

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了operation5");
    }
}

class D implements Interface {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

/**
 * A类通过接口Interface1依赖（使用）类B，但是只会用到1,2,3方法
 */
class A {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend2(Interface i) {
        i.operation2();
    }
    public void depend3(Interface i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1依赖（使用）类D，但是只会用到1,4,5方法
 */
class C {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend4(Interface i) {
        i.operation4();
    }
    public void depend5(Interface i) {
        i.operation5();
    }
}