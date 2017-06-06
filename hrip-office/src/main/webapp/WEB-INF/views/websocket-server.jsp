<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<Style>
#css3menu li {
    float: left;
    list-style-type: none;
}

#css3menu li a {
    color: #fff;
    padding-right: 20px;
}

#css3menu li a.active {
    color: yellow;
}
</style>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
    



    <script type="text/javascript" src="<%=basePath%>assets/js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>assets/js/websocket/sockjs-1.1.4.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>assets/js/websocket/stomp.min.js"></script>
    <script type="text/javascript">
    	// 使用stomp订阅服务器的消息，当服务器发送消息时，这里会接收并处理
		var url = '<%=basePath%>marcopolo';
		var sock = new SockJS(url);
		var stomp = Stomp.over(sock);
		
		stomp.connect('guest','guest',function(frame){
			console.log('Connected');
			stomp.subscribe('/topic/spittlefeed', handSub); // 订阅消息
		});
		function handSub(incoming){
			console.log(incoming);
		}
		
    </script>
</body>
</html>