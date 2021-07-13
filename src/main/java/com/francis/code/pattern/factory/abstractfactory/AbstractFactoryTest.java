package com.francis.code.pattern.factory.abstractfactory;


/**
 * @Author Francis
 * @Date 2020/9/14 22:37
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PigAnimalsFactory pigAnimalsFactory = new PigAnimalsFactory();
        pigAnimalsFactory.createRed().run();
        pigAnimalsFactory.creatWhite().sleep();
        RabbitAnimalsFactory rabbitAnimalsFactory = new RabbitAnimalsFactory();
        rabbitAnimalsFactory.createRed().run();
        rabbitAnimalsFactory.creatWhite().sleep();
    }
}

