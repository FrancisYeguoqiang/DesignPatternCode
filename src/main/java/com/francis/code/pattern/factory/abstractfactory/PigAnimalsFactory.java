package com.francis.code.pattern.factory.abstractfactory;

/**
 * @Author Francis
 * @Date 2020/9/14 22:32
 * @Version 1.0
 */
public class PigAnimalsFactory implements IAnimalsFactory {


    public IWhite creatWhite() {
        return new WhitePig();
    }


    public IRed createRed() {
        return new RedPig();
    }


}
