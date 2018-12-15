<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>BASEPROJECT</title>

<link rel="shortcut icon" href="./favicon.ico" />
<link rel="bookmark" href="./favicon.ico" />
<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>platform/bootstrap/css/bootstrap.css">
		
<!-- Font Awesome -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>platform/font-awesome/css/font-awesome.min.css">

<!-- Simplify -->
<link href="<%=basePath %>platform/Simplify/css/simplify.min.css" rel="stylesheet">

<!-- three_bg -->
<link href="<%=basePath %>platform/three_bg/css/normalize.css" rel="stylesheet">
<link href="<%=basePath %>platform/three_bg/css/default.css" rel="stylesheet">

<style type="text/css">
	.logo{
	    width: 100px;
	    height: 100px;
	    background-image: url(<%=basePath %>image/logo_font.png);
	    background-repeat: round;
	}
	
	#canvas{
        width:100%;
        height:500px;
        overflow: hidden;
        position:absolute;
        top:0;
        left:0;
        background-color: #1a1724;               
    }
    .canvas-wrap{
        position:relative;
        
    }
	
</style>

</head>

<body class="overflow-hidden light-background">
	<div class="one">
		<section class="canvas-wrap">
	        <div id="canvas" class="gradient"></div>
	    </section>
	</div>
	<div class="wrapper no-navigation preload">
		<div class="sign-in-wrapper">
			<div class="sign-in-inner">
				<div class="login-brand text-center">
					<i class="fa logo"></i>
				</div>
				<form>
					<div class="form-group m-bottom-md">
						<!-- <input type="text" class="form-control" placeholder="Email Address"> -->
						<input id="l-username" class="form-control" type="text" name="username" placeholder="用户名" onkeydown="enterLogin();" />
					</div>
					<div class="form-group">
						<!-- <input type="password" class="form-control" placeholder="Password"> -->
						<input id="l-password" class="form-control" type="password" name="password" placeholder="密码" onkeydown="enterLogin();" />
					</div>

					<div class="m-top-md p-top-sm">
						<a href="javascript:;" class="btn btn-info block" onclick="login()">登陆</a>
					</div>

					<div class="m-top-md p-top-sm">
						<div class="font-12 text-center m-bottom-xs">
							<a href="javascript:;" class="font-12">忘记密码请联系系统管理员</a>
						</div>
						<!-- <div class="font-12 text-center m-bottom-xs">Do not have an account?</div>
						<a href="signup.html" class="btn btn-default block">Create an accounts</a> -->
					</div>
				</form>
			</div><!-- ./sign-in-inner -->
		</div><!-- ./sign-in-wrapper -->
	</div><!-- /wrapper -->

	
	
	
	<!-- Le javascript================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	
	<!-- Jquery -->
	<script src="<%=basePath %>platform/Simplify/js/jquery-1.11.1.min.js"></script>
	
	<!-- Bootstrap -->
    <script src="<%=basePath %>platform/bootstrap/js/bootstrap.min.js"></script>
    
    <!-- Slimscroll -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.slimscroll.min.js'></script>
	
	<!-- Popup Overlay -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.popupoverlay.min.js'></script>
	
	<!-- Modernizr -->
	<script src='<%=basePath %>platform/Simplify/js/modernizr.min.js'></script>
	
	<!-- Simplify -->
	<script src="<%=basePath %>platform/Simplify/js/simplify/simplify.js"></script>
	
	<!-- three_bg -->
	<script src="<%=basePath %>platform/three_bg/js/three.min.js"></script>
	<script src="<%=basePath %>platform/three_bg/js/projector.js"></script>
	<script src="<%=basePath %>platform/three_bg/js/canvas-renderer.js"></script>
	<script src="<%=basePath %>platform/three_bg/js/3d-lines-animation.js"></script>
	<script src="<%=basePath %>platform/three_bg/js/color.js"></script>
	
	<script type="text/javascript">
		
		$(document).ready(function() {
			var height = $(window).height();
			$("#canvas").height(height);
		});
		
		window.onresize = function(){
			var height = $(window).height();
			$("#canvas").height(height);
		};
	
		function enterLogin(){
			if (event.keyCode==13){
				login();
			}
		}
	
		function login() {
			var username = $("#l-username").val();
			var password = $("#l-password").val();
			if(username==null || username==""){
				$("#l-username").attr('placeholder',"请输入用户名");
				return;
			}
			
			if(password==null || password==""){
				$("#l-password").attr('placeholder',"请输入密码");
				return;
			}
			
			$.ajax({
				type : "POST",
				dataType : "json",
				url : "<%=basePath %>manager/login",
				data:{"username":username,"password":password},
				success : function(data) {
					if (data.resultCode == -1) {
						$("#l-password").val("");
						$("#l-password").attr('placeholder',data.resultMsg);
					}
					if (data.resultCode == -2) {
						$("#l-username").val("");
						$("#l-username").attr('placeholder',data.resultMsg);
					}
					if (data.resultCode == 1) {
						window.location.href = "<%=basePath %>manager/manager";
					}
				},
				error : function(data) {
					console.log(data.info);
				}
			});
	
		}
	</script>
	
</body>
</html>
