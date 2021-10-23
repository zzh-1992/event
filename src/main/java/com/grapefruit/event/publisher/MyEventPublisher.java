package com.grapefruit.event.publisher;

import com.grapefruit.event.localevent.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 调用接口触发事件
 *
 * @author Grapefruit
 * @version 1.0
 * @date 2021/4/28
 */
@RestController
@RequestMapping("/")
public class MyEventPublisher {

    @Autowired
    ApplicationEventPublisher publisher;


    @RequestMapping("/event")
    public String eventHappen() {
        // 发布事件
        publisher.publishEvent(new MyEvent(new Object()));

        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
}
