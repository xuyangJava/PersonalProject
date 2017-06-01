package com.sipingsoft.office.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class MarcoHandler extends AbstractWebSocketHandler {

	private static final Logger logger = LoggerFactory.getLogger(MarcoHandler.class);
	
	protected void handleTextMessage(WebSocketSession session, 
			TextMessage message) throws Exception {
		logger.info("收到消息：" + message.getPayload());
		
		Thread.sleep(2000);
		logger.info("发送消息：Polo !");
		session.sendMessage(new TextMessage("Polo !"));
	}
	@Override
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		logger.info("连接已建立");
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session,
			CloseStatus status) throws Exception {
		logger.info("连接已断开");
	}
}
