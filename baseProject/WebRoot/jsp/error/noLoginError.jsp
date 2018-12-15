<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>noLoginError</title>
    
    <link rel="shortcut icon" href="./favicon.ico" />
	<link rel="bookmark" href="./favicon.ico" />

  </head>
  
  <body BGCOLOR="#FDF5E6">

	<H2>您还没有登陆！</H2>
		
	<span>请点击<A HREF="<%=basePath%>" target="_parent"><p id="c">这里</p></A>登陆.</span>
	
	<!-- Jquery -->
	<script src="<%=basePath %>platform/Simplify/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#c').click();
	});
	</script>
  </body>
</html>
