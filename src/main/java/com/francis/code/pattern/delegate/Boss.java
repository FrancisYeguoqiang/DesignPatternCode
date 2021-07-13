package com.francis.code.pattern.delegate;

/**
 * @Author Francis
 * @Date 2020/9/26 19:00
 * @Version 1.0
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}

