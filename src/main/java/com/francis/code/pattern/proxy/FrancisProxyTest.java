package com.francis.code.pattern.proxy;

/**
 * @Author Francis
 * @Date 2020/9/20 18:39
 * @Version 1.0
 */
public class FrancisProxyTest {
    public static void main(String[] args) throws Exception {
         //JDK动态代理的实现原理
         Product obj = (Product)new FrancisAgent().getInstance(new Apple());
         System.out.println(obj.getClass());
         obj.eat();
    }
}
