package com.francis.code.pattern.template;

/**
 * @Author Francis
 * @Date 2020/9/26 17:52
 * @Version 1.0
 */
public class ClothesShopping extends Shopping {
    @Override
    public void addToCart() {
        System.out.println("add a clothes...");
    }

    @Override
    public void payMent() {
        System.out.println("use weichatpay....");
    }
}
