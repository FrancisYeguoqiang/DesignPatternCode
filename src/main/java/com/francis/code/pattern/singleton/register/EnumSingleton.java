package com.francis.code.pattern.singleton.register;


/**
 * @Author Francis
 * @Date 2020/9/20 17:18
 * @Version 1.0
 * 常量中去使用，常量不就是用来大家都能够共用吗？
 * 通常在通用API中使用
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
