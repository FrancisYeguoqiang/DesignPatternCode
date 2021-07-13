package com.francis.code.pattern.proxy;

import java.lang.reflect.Method;

/**
 * @Author Francis
 * @Date 2020/9/20 18:38
 * @Version 1.0
 */
public interface FrancisInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
