package com.sipingsoft.office.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import com.sipingsoft.office.web.entity.Spittle;

@Service
public class SubServiceImpl {

	private SimpMessageSendingOperations messaging;
	
	public SubServiceImpl(){
	}
	
	@Autowired
	public SubServiceImpl(SimpMessageSendingOperations messaging){
		this.messaging = messaging;
	}
	
	/**
	 * 发送消息
	 * @param shout
	 */
	public void broadcastSub(Spittle spittle){
		messaging.convertAndSend("/topic/spittlefeed", spittle); 
	}
}
