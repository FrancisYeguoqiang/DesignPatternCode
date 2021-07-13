package com.francis.code.pattern.adapter;

/**
 * @Author Francis
 * @Date 2020/9/26 19:53
 * @Version 1.0
 * @description 使用适配器模式进行兼容登录
 */
public class SiginNewServiceAdapter extends SiginService implements ISiginNewService{
    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        // 通过手机号找到用户信息，在进行安全校验和验证码校验
        return loginForAccount("Francis","1234");
    }

    @Override
    public ResultMsg loginForQrCode(String code) {
        // 进行二维码登录操作
        return loginForAccount("Francis","1234");
    }

    @Override
    public ResultMsg loginForAccount(String username, String passport) {
        return super.login(username,passport);
    }
}
