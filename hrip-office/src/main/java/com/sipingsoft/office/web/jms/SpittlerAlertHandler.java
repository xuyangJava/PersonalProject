package com.sipingsoft.office.web.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;

import com.sipingsoft.office.web.entity.Spittle;

/**
 * 处理JMS消息的类，需要配置监听器
 * @author siping-yx
 * @date 2017年7月21日
 * @version 1.0
 *
 */
public class SpittlerAlertHandler {
    
    @Autowired
    private SimpMessageSendingOperations messaging;

    public void handleSpittleAlert(Spittle spittle) {
        System.out.println(spittle);
    }
    
    public void handleSpittleTopic(Spittle spittle) {
        System.out.println(spittle);
        messaging.convertAndSend("/topic/spittlefeed", spittle);
    }
}
