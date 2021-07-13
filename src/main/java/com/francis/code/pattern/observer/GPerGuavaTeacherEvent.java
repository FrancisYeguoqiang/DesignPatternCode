package com.francis.code.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @Author Francis
 * @Date 2020/10/3 22:00
 * @Version 1.0
 */
public class GPerGuavaTeacherEvent {
   private String teacherName;

    public GPerGuavaTeacherEvent(String teacherName) {
        this.teacherName = teacherName;
    }

    @Subscribe
    public void subscribe(Question question){
        System.out.println(this.teacherName + "老师，你好！\n" +
                "您收到了一个来自“" + question.getUserName() + "”同学的提问，希望您解答，问题内容如下：\n" +
                question.getContext());
    }
}
