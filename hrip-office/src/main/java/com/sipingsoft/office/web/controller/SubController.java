package com.sipingsoft.office.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
public class SubController {

	@Autowired
	private SimpMessageSendingOperations messaging;
	
	
}
