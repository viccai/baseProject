<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>exception</title>
    
    <link rel="shortcut icon" href="./favicon.ico" />
	<link rel="bookmark" href="./favicon.ico" />
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body BGCOLOR="#FDF5E6">

	<H2>出错了，肯定哪里不对!</H2>
		
	<span>请点击<A HREF="<%=basePath%>"><p id="c">这里</p></A>回到首页.</span>
	<!-- Jquery -->
	<script src="<%=basePath %>platform/Simplify/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#c').click();
	});
	</script>
  </body>
</html>
