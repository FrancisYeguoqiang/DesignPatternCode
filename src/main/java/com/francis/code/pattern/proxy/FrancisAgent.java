package com.francis.code.pattern.proxy;

import java.lang.reflect.Method;

/**
 * @Author Francis
 * @Date 2020/9/20 18:39
 * @Version 1.0
 */
public class FrancisAgent implements FrancisInvocationHandler{

    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return FrancisProxy.newProxyInstance(new FrancisClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("I am Agent,i will give you a product");
        System.out.println("begin.....");
    }

    private void after(){
        System.out.println("done");
    }
}
