package com.grapefruit.event.listener;

import com.grapefruit.event.localevent.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听器
 *
 * @author Grapefruit
 * @version 1.0
 * @date 2021/4/28
 */
@Component
public class MyEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 监听自定义事件
        if (event instanceof MyEvent) {
            System.out.println("我的事件发布了");
        }

        // 监听spring ContextRefreshedEvent事件
        if (event instanceof ContextRefreshedEvent) {
            System.out.println("Finish the refresh of this context");
        }
    }
}
