package com.francis.code.pattern.adapter;

/**
 * @Author Francis
 * @Date 2020/9/26 20:01
 * @Version 1.0
 */
public class SiginAdapterTest {
    public static void main(String[] args) {
        ISiginNewService siginNewService = new SiginNewServiceAdapter();
        System.out.println(siginNewService.loginForQrCode("dadasdasdasdasd"));
        System.out.println(siginNewService.loginForTelphone("18664033806","0685458"));
    }
}
