package com.francis.code.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Author Francis
 * @Date 2020/10/3 22:05
 * @Version 1.0
 */
public class GPerGuavaObserverTest {
    public static void main(String[] args) {

        Question question = new Question();
        question.setUserName("叶国强");
        question.setContext("如何深入理解设计模式？");
        //消息总线
        EventBus eventBus = new EventBus();
        GPerGuavaTeacherEvent guavaEvent = new GPerGuavaTeacherEvent("TOM");
        eventBus.register(guavaEvent);
        eventBus.post(question);
    }
}
