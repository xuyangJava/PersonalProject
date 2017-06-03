package com.sipingsoft.office.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sipingsoft.office.web.entity.Spittle;
import com.sipingsoft.office.web.service.SubServiceImpl;

@Controller
public class SubController {

	@Autowired
	private SimpMessageSendingOperations messaging;
	@Autowired
	private SubServiceImpl service;
	
	@RequestMapping("/sendMessageToClient")
	public void sendMessageToClient(){
		Spittle s = new Spittle("Hello Client!", new Date(), 5d, 6d);
		service.broadcastSub(s);
	}
}
