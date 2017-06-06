package com.sipingsoft.office.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * spring的web消息功能基于消息代理构建，因此除了告诉spring我们想要处理消息以外，必须还要配置一个消息代理和其他的一些消息目的地。 
 */
@Configuration
@EnableWebSocketMessageBroker // 启用了websocket，配置基于代理的stomp
public class WebSocketStompConfig extends AbstractWebSocketMessageBrokerConfigurer {

	/**
	 * 配置基于代理的STOMP端点，客户端在订阅或发布消息到目的地路径前，要连接该端点
	 */
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// 为marcopolo启用sockJS功能,JS端订阅前连接时使用该路径
		// 将marcopolo注册为stomp的断点
		registry.addEndpoint("/marcopolo").withSockJS(); 
	}

	/**
	 * 一个简单的消息代理，如果不重载该方法，将会默认配置一个简单的内存消息代理，默认处理/topic为前缀的消息。
	 * 当消息到达时，目的地的前缀将决定该消息如何处理，应用程序的目的地以/app为前缀（以应用程序为目的地的消息
	 * 将会直接路由到带有@MessageMapping注解的控制器方法中），而代理的目的地将以/queue和/topic
	 * 为前缀（发送到代理的消息，包括@MessageMapping返回的消息，将会路由到代理上，最终发送到订阅这些目的地的客户端）
	 */
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// 使用代理中继，例如activeMQ，默认会监听localhost的61613端口，用户名和密码都为guest
		registry.enableStompBrokerRelay("/queue", "/topic");
		
		//registry.enableSimpleBroker("/queue", "/topic"); // 默认会有个前缀为topic代理
		/*registry.enableStompBrokerRelay("/queue", "/topic") // 使用activeMQ做代理
		.setRelayHost("127.0.0.1").setRelayPort(61613)
		.setClientLogin("guest").setClientPasscode("guest");*/
		// 表示客户端像服务端发送主题上面需要加上/app前缀
		registry.setApplicationDestinationPrefixes("/app"); // 发往应用程序的消息会带有app前缀
	}
}
