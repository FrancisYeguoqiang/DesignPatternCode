package com.francis.code.pattern.adapter;

/**
 * @Author Francis
 * @Date 2020/9/26 19:00
 * @Version 1.0
 */
public interface ISiginNewService {

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 二维码登录
     * @param code
     * @return
     */
    ResultMsg loginForQrCode(String code);

    /**
     * 账号密码
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForAccount(String username, String passport);
}
