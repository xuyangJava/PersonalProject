package com.sipingsoft.office.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker // 启用了websocket，配置基于代理的stomp
public class WebSocketStompConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/marcopolo").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/queue", "/topic"); // 默认会有个前缀为topic代理
		/*registry.enableStompBrokerRelay("/queue", "/topic") // 使用activeMQ做代理
		.setRelayHost("127.0.0.1").setRelayPort(61613)
		.setClientLogin("guest").setClientPasscode("guest");*/
		registry.setApplicationDestinationPrefixes("/app"); // 发往应用程序的消息会带有app前缀
	}
}
