package com.francis.code.pattern.template;

/**
 * @Author Francis
 * @Date 2020/9/26 17:41
 * @Version 1.0
 */
public abstract class Shopping {
    // 模板方法
    public final void buyGoods() {
        // 1、登录购物app
        this.loginApp();
        // 2、加入购物车
        this.addToCart();
        // 3、付款
        this.payMent();
    }

    public final void loginApp() {
        System.out.println("user login in......");
    }

    public abstract void addToCart();

    // 钩子方法
    public void payMent() {
        System.out.println("use alipay...");
    }
}
