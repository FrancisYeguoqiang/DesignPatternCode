package com.francis.code.pattern.prototype;

/**
 * @Author Francis
 * @Date 2020/9/20 15:54
 * @Version 1.0
 * @description 给寿险某APP的频道推送简单消息
 */
public class SendYzlAgentMessage {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 本次只模拟给一个用户推送消息，实际业务上，存在给多个用户推送。
        AgentMessage agentMessage = new AgentMessage();
        agentMessage.setTouser("叶国强");
        agentMessage.setTitle("开心一下");
        agentMessage.setMsgtype("text");
        agentMessage.setContext("要坚持学习哦");
        agentMessage.setUrl("https://study.gupaoedu.cn");
        System.out.println("给用户推送简单消息");

        // 开始浅克隆
        AgentMessage message1 = agentMessage.clone();
        System.out.println("推送的消息为："+message1);
    }


}
