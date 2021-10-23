package com.grapefruit.event.localevent;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 *
 * @author Grapefruit
 * @version 1.0
 * @date 2021/4/28
 */
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
