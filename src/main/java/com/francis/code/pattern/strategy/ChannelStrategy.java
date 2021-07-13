package com.francis.code.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Francis
 * @Date 2020/9/20 23:03
 * @Version 1.0
 */
public class ChannelStrategy {
    /**
     * 渠道策略
     */
    private static Map<String,Channel> channelStrategy = new HashMap<String,Channel>();
    static {
        channelStrategy.put(ChannelType.YZL,new YzlBusiness());
        channelStrategy.put(ChannelType.LSXT,new LsxtBusiness());
    }
    /**
     * 根据不同的渠道进行不同的业务处理
     */
    public static Channel getChannel(String key){
        if(!channelStrategy.containsKey(key)){
            return channelStrategy.get(ChannelType.LSXT);
        }
        return channelStrategy.get(key);
    }
    /**
     * 渠道类别
     */
    private interface ChannelType{
        String YZL = "YZL";
        String LSXT = "LSXT";
    }
}
