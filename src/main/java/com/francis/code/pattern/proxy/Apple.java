package com.francis.code.pattern.proxy;

/**
 * @Author Francis
 * @Date 2020/9/20 18:58
 * @Version 1.0
 */
public class Apple implements Product {

    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}
