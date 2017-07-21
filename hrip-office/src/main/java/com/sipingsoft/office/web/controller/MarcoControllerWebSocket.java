package com.sipingsoft.office.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import com.sipingsoft.office.web.entity.Shout;

/**
 * webSocket模拟测试类
 */
@Controller
public class MarcoControllerWebSocket {
	
	private static final Logger logger = LoggerFactory.getLogger(MarcoControllerWebSocket.class);
	
	/**
	 * 处理指定目的地（/app/stomp/marco，/app是隐含的）到达的消息
	 * 如果加了@SendTo注解的话，消息会发送到指定的目的地，这样会经过代理
	 * @param incoming
	 */
	@MessageMapping("/stomp/marco")
	@SendTo("/topic/stomp/shout") // 重载返回目的地，如果不加默认的目的地为/topic/stomp/marco
	public Shout handleShout(Shout incoming) {
		logger.info("收到消息："+ incoming.getMessage());
		Shout outgoing = new Shout();
		outgoing.setMessage("Polo22!");
		return outgoing;
	}
	
	/**
	 * 处理订阅消息，只处理以/app开头的消息，
	 * 主要应用场景是请求--回应模式，客户端订阅某一个目的地，然后预期从这个目的地上获取响应
	 * 这种方式和http请求的区别在于，这种方式是异步的，而http是同步的
	 * @return
	 */
	@SubscribeMapping({"/stomp/marco"})
	public Shout handleSubscription() {
		Shout outgoing = new Shout();
		outgoing.setMessage("Polo!");
		return outgoing;
	}
}
