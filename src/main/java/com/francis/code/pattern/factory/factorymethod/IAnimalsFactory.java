package com.francis.code.pattern.factory.factorymethod;


import com.francis.code.pattern.factory.IAnimals;

/**
 * @Author Francis
 * @Date 2020/9/14 22:33
 * @Version 1.0
 *  工厂方法模式
 */
public interface IAnimalsFactory {
    IAnimals product();
}
