package com.francis.code.pattern.singleton.lazy;

/**
 * @Author Francis
 * @Date 2020/9/20 17:18
 * @Version 1.0
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
