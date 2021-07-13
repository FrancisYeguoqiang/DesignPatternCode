package com.francis.code.pattern.factory.factorymethod;


import com.francis.code.pattern.factory.IAnimals;
import com.francis.code.pattern.factory.PigAnimal;

/**
 * @Author Francis
 * @Date 2020/9/14 22:32
 * @Version 1.0
 */
public class PigAnimalsFactory implements IAnimalsFactory {

    public IAnimals product() {
        return new PigAnimal();
    }
}
