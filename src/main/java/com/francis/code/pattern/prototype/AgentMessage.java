package com.francis.code.pattern.prototype;

/**
 * @Author Francis
 * @Date 2020/9/20 17:18
 * @Version 1.0
 */
public class AgentMessage implements Cloneable{
    private String touser;//登录用户
    private String msgtype;//消息类型
    private String title;//消息标题
    private String context;//消息内容
    private String url;//点击链接

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "AgentMessage{" +
                "touser='" + touser + '\'' +
                ", msgtype='" + msgtype + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public AgentMessage clone() throws CloneNotSupportedException {
       return (AgentMessage)super.clone();
    }
}
