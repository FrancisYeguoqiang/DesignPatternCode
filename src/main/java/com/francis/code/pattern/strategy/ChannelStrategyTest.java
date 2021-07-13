package com.francis.code.pattern.strategy;

/**
 * @Author Francis
 * @Date 2020/9/20 23:28
 * @Version 1.0
 */
public class ChannelStrategyTest {
    public static void main(String[] args) {
        Channel channel = ChannelStrategy.getChannel("YZL");
        System.out.println(channel.doBusiness());
    }
}
