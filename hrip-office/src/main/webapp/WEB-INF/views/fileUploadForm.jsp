<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form method="POST" action="http://localhost:8080/office/fileUpload" enctype="multipart/form-data">
        <label>图片</label>
        <!-- <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif"> -->
        <input name = "name">
        <input name = "password">
        <input type="hidden" name="token" value="${token}" />
        <input type="button" onclick="addUser();" value="提交">
    </form>
</body>
<script type="text/javascript" src="http://localhost:8080/office/static/js/jquery-1.11.1.js"></script>
<script type="text/javascript">
function addUser(){
    $.post("http://localhost:8080/office/test/submit", 
            { name: $('input[name="name"]').val(), password:  $('input[name="password"]').val(),token: $('input[name="token"]').val() },function(data){
        alert("Data Loaded: " + data);
    } );
}
</script>
</html>