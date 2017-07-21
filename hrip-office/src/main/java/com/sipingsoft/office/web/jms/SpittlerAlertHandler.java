package com.sipingsoft.office.web.jms;

import com.sipingsoft.office.web.entity.Spittle;

/**
 * 处理JMS消息的类，需要配置监听器
 * @author siping-yx
 * @date 2017年7月21日
 * @version 1.0
 *
 */
public class SpittlerAlertHandler {

    public void handleSpittleAlert(Spittle spittle) {
        System.out.println(spittle);
    }
}
