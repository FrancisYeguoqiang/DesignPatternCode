package com.francis.code.pattern.singleton.hungry;

/**
 * @Author Francis
 * @Date 2020/9/20 17:18
 * @Version 1.0
 * 饿汉式静态块单例
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
