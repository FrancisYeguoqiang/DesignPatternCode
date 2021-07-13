package com.francis.code.pattern.factory.abstractfactory;


/**
 * @Author Francis
 * @Date 2020/9/14 22:32
 * @Version 1.0
 */
public class RabbitAnimalsFactory implements IAnimalsFactory {

    public IWhite creatWhite() {
        return new WhiteRabbit();
    }

    public IRed createRed() {
        return new RedRabbit();
    }
}
