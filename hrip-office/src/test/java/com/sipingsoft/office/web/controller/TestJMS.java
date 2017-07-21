package com.sipingsoft.office.web.controller;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.sipingsoft.office.conf.ActiveMQConfig;
import com.sipingsoft.office.conf.DBConfig;
import com.sipingsoft.office.conf.MybatisConfig;
import com.sipingsoft.office.conf.RedisConfig;
import com.sipingsoft.office.conf.RootConfig;
import com.sipingsoft.office.web.entity.Spittle;
import com.sipingsoft.office.web.jms.AlertService;

@ContextConfiguration(classes = {RootConfig.class, DBConfig.class, MybatisConfig.class, RedisConfig.class, ActiveMQConfig.class})  
public class TestJMS {
	
	@Autowired
	private AlertService service;

	public void sendMessage(){
		ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection conn = null;
		Session session = null;
		
		try {
			conn = cf.createConnection();
			session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = new ActiveMQQueue("spitter.queue");
			// 消息的生产者
			MessageProducer producer = session.createProducer(destination);
			TextMessage message = session.createTextMessage();
			message.setText("Hello JMS");
			producer.send(message);
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			try {
				if(session != null) {
					session.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void reciveMessage(){
		ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection conn = null;
		Session session = null;
		
		try {
			conn = cf.createConnection();
			conn.start();
			session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = new ActiveMQQueue("spittle.alert.queue");
			// 消息的消费者
			MessageConsumer consumer = session.createConsumer(destination);
			Message message = consumer.receive();
			TextMessage textMessage = (TextMessage) message;
			System.out.println("收到消息：" + textMessage.getText());
			conn.start();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			try {
				if(session != null) {
					session.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void sendMessageByTemplate(){
		Spittle s = new Spittle("HELLO WORLD!", null, null, null);
		try {
		    service.sendSpittleAlert(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
