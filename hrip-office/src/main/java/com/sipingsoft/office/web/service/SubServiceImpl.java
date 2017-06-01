package com.sipingsoft.office.web.service;

import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import com.sipingsoft.office.web.entity.Shout;

@Service
public class SubServiceImpl {

	private SimpMessageSendingOperations messaging;
	
	public SubServiceImpl(){
	}
	
	public SubServiceImpl(SimpMessageSendingOperations messaging){
		this.messaging = messaging;
	}
	
	/**
	 * 发送消息
	 * @param shout
	 */
	public void broadcastSub(Shout shout){
		messaging.convertAndSend("/topic/sub", shout); 
	}
}
