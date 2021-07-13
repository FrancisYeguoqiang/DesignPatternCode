package com.francis.code.pattern.factory.simplefactory;


import com.francis.code.pattern.factory.IAnimals;
import com.francis.code.pattern.factory.PigAnimal;
import com.francis.code.pattern.factory.RabbitAnimal;
/**
 * @Author Francis
 * @Date 2020/10/26 22:19
 * @Version 1.0
 */
public class AnimalsFactoryTest {
    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        IAnimals iAnimals = animalsFactory.creat(PigAnimal.class);
        iAnimals.product();
        IAnimals iAnimals1 = animalsFactory.creat(RabbitAnimal.class);
        iAnimals1.product();
    }
}
