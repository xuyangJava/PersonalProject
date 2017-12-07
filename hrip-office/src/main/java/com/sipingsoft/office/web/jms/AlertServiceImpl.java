package com.sipingsoft.office.web.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.sipingsoft.office.web.entity.Spittle;

@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsTemplate jmsQueueTemplate;
    @Autowired
	private JmsTemplate jmsTopicTemplate;
	
	@Override
	public void sendSpittleAlert(final Spittle spittle) {
		// 第一个是目的地，第二个是一个匿名内部类用来构造消息
	    jmsQueueTemplate.send("spittle.alert.queue",new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(spittle); // 创建消息
			}
		});
	}

	/**
	 * 使用convertAndSend时在发送消息会自动对消息进行转换，不需要使用MessageCreator
	 */
	@Override
	public void convertAndSendSpittleAlert(Spittle spittle) {
	    jmsTopicTemplate.convertAndSend(spittle);
	}
	
	/**
	 * 接收jms消息，这里最大的问题就是该方法是堵塞的
	 */
	@Override
	public Spittle receiveAndConvert(){
	    return (Spittle) jmsTopicTemplate.receiveAndConvert();
	}

}
