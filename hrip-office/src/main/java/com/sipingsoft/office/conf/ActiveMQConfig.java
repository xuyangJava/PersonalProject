package com.sipingsoft.office.conf;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import com.sipingsoft.office.web.jms.SpittlerAlertHandler;

@Configuration
@ImportResource({"classpath:/config/activeMQ.xml"})
public class ActiveMQConfig {

    @Bean
    @Qualifier("amqConnectionFactory")
    public ActiveMQConnectionFactory ampConnectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");
        return connectionFactory;
    }
    // 缓存连接工厂
    @Bean
    @Qualifier("connectionFactory")
    public CachingConnectionFactory connectionFactory(ActiveMQConnectionFactory amqConnectionFactory) {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setTargetConnectionFactory(amqConnectionFactory);
        connectionFactory.setSessionCacheSize(20);
        return connectionFactory;
    }
    
    @Bean
    public ActiveMQQueue activeMQQueue() {
        ActiveMQQueue activeMQQueue = new ActiveMQQueue();
        activeMQQueue.setPhysicalName("spittle.alert.queue");
        return activeMQQueue;
    }
    
    @Bean
    public ActiveMQTopic activeMQTopic() {
        ActiveMQTopic activeMQTopic = new ActiveMQTopic();
        activeMQTopic.setPhysicalName("spittle.alert.topic");
        return activeMQTopic;
    }
    
    @Bean
    public JmsTemplate jmsTemplate(@Qualifier("connectionFactory") ActiveMQConnectionFactory connectionFactory, ActiveMQQueue activeMQQueue) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        // 设置默认的目的地名称
        // jmsTemplate.setDefaultDestinationName("spittle.alert.queue");
        // 设置默认的目的地类型
        // jmsTemplate.setDefaultDestination(activeMQQueue);
        // 队列模式，true为topic模式
        jmsTemplate.setPubSubDomain(false);
        return jmsTemplate;
    }
    
    @Bean
    public SpittlerAlertHandler spittlerAlertHandler(){
        return new SpittlerAlertHandler();
    }
    
    // 可以额外的配置消息转换器
}
