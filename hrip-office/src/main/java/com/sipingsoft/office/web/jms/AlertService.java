package com.sipingsoft.office.web.jms;

import com.sipingsoft.office.web.entity.Spittle;

public interface AlertService {

	void sendSpittleAlert(Spittle spittle);
	
	void convertAndSendSpittleAlert(Spittle spittle);

    Spittle receiveAndConvert();
}
