package com.francis.code.pattern.factory.factorymethod;


import com.francis.code.pattern.factory.IAnimals;

/**
 * @Author Francis
 * @Date 2020/9/14 22:37
 * @Version 1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IAnimalsFactory iAnimalsFactory = new PigAnimalsFactory();
        IAnimals iAnimals = iAnimalsFactory.product();
        iAnimals.product();
        iAnimalsFactory.product();
        iAnimalsFactory = new RabbitAnimalsFactory();
        iAnimals =iAnimalsFactory.product();
        iAnimals.product();
    }
}

