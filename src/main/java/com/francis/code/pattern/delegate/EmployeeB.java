package com.francis.code.pattern.delegate;

/**
 * @Author Francis
 * @Date 2020/9/26 19:00
 * @Version 1.0
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
