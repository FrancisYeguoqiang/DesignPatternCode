package com.francis.code.pattern.adapter;

/**
 * @Author Francis
 * @Date 2020/9/26 18:53
 * @Version 1.0
 * @description 传统的账号密码登录
 */
public class SiginService {
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return new ResultMsg("登录成功！",100,"alikado");
    }
}
