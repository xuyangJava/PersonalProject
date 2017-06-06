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
    	// 使用stomp发送消息到服务器
		var url = '<%=basePath%>marcopolo';
		var sock = new SockJS(url);
		var stomp = Stomp.over(sock);
		
		var payload = JSON.stringify({'message' : 'Marco22!'});
		
		stomp.connect('guest','guest',function(frame){
			stomp.subscribe('/topic/stomp/shout', handSub); // 订阅返回的消息
			stomp.send('/app/stomp/marco',{},payload); // 第二个参数是头消息的Map参数
		});
		
		function handSub(shout){
			console.log(shout);
		}
    </script>
</body>
</html>