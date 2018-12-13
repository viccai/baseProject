<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
  </head>
  
  <script type="text/javascript">
  
  function adduser() {

		var username = $("#username").val();

		$.ajax({
			type : "POST",
			dataType : "json",
			async : false,
			url : "<%=basePath%>user/addUser?username=" + username,
			success : function(data) {
				if (data.resultCode == -1) {
					alert(data.resultMsg);
				}
				if (data.resultCode == 1) {
					alert(data.resultMsg);
				}
			},
			error : function(data) {
				// 输出错误信息;
				console.log(data.info);
			}
		});

	}
  
  
  </script>
  
  <body>
    <input id="username" type="text" name="username" placeholder="请输入用户名" class="dtint" />
    <input type="submit" value="添加用户" class="dtbtn" onclick="adduser()" />
  </body>
</html>
