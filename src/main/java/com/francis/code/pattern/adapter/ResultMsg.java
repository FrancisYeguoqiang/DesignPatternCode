package com.francis.code.pattern.adapter;

/**
 * @Author Francis
 * @Date 2020/9/26 18:54
 * @Version 1.0
 * @description 登录结果信息
 */
public class ResultMsg {
    private String msg;
    private int code;
    private Object data;

    public ResultMsg(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
