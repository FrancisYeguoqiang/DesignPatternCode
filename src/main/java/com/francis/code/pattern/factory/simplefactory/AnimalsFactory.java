package com.francis.code.pattern.factory.simplefactory;


import com.francis.code.pattern.factory.IAnimals;

/**
 * @Author Francis
 * @Date 2020/10/26 22:19
 * @Version 1.0
 */
public class AnimalsFactory extends AnimalsFactoryTest{

    public IAnimals creat(Class<? extends IAnimals> clazz ){
        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch(Exception ex){
            ex.fillInStackTrace();
        }
     return null;
    }
}
