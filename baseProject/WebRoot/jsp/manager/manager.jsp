<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<meta charset="utf-8">
<title>BASEPROJECT</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="shortcut icon" href="<%=basePath%>favicon.ico" />
<link rel="bookmark" href="<%=basePath%>favicon.ico" />

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>platform/bootstrap/css/bootstrap.css">
		
<!-- Font Awesome -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>platform/font-awesome/css/font-awesome.min.css">

<!-- layer ui core css -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>platform/layui/css/layui.css">

<!-- ionicons -->
		
<!-- Morris -->
<link href="<%=basePath %>platform/Simplify/css/morris.css" rel="stylesheet"/>	

<!-- Datepicker -->
<link href="<%=basePath %>platform/Simplify/css/datepicker.css" rel="stylesheet"/>	

<!-- Animate -->
<link href="<%=basePath %>platform/Simplify/css/animate.min.css" rel="stylesheet">

<!-- Owl Carousel -->
<link href="<%=basePath %>platform/Simplify/css/owl.carousel.min.css" rel="stylesheet">
<link href="<%=basePath %>platform/Simplify/css/owl.theme.default.min.css" rel="stylesheet">

<!-- Simplify -->
<link href="<%=basePath %>platform/Simplify/css/simplify.css" rel="stylesheet">

<style type="text/css">
	.logo{
	    position: absolute;
	    width: 40px;
	    height: 30px;
	    background-image: url(<%=basePath %>image/logo.png);
	    background-repeat: round;
	    margin: 10px 0px 0px 40px;
	}
</style>
</head>

<body class="overflow-hidden">
	<div class="wrapper preload">
		<header class="top-nav">
			<div class="top-nav-inner">
				<div class="nav-header">
					<a href="javascript:;" class="brand">
						<i class="fa logo"></i><span class="brand-name">易趣四点半</span>
					</a>
				</div>
				<div class="nav-container">
					<button type="button" class="navbar-toggle pull-left sidebar-toggle" id="sidebarToggleLG">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<div class="pull-right m-right-sm">
						<div class="user-block hidden-xs">
							<a href="#" id="userToggle" data-toggle="dropdown">
								<%-- <img src="<%=basePath %>platform/Simplify/images/profile/profile1.jpg" alt="" class="img-circle inline-block user-profile-pic"> --%>
								<div class="user-detail inline-block">
									${manager.username}
									<i class="fa fa-angle-down"></i>
								</div>
							</a>
							<div class="panel border dropdown-menu user-panel">
								<div class="panel-body paddingTB-sm">
									<ul>
										<li>
											<a href="javascript:;" onclick="editPassword()">
												<i class="fa fa-edit fa-lg"></i><span class="m-left-xs">修改密码</span>
											</a>
										</li>
										<li>
											<a href="javascript:;" onclick="logout()">
												<i class="fa fa-power-off fa-lg"></i><span class="m-left-xs">注销</span>
											</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div><!-- ./top-nav-inner -->	
		</header>
		<aside class="sidebar-menu fixed">
			<div class="sidebar-inner scrollable-sidebar">
				<div class="main-menu">
					<ul class="accordion">
						<li class="menu-header">
							Main Menu
						</li>
						<li id="menu_0" class="menu_list bg-palette1 active">
							<a href="javascript:;" onclick="open_menu('manager/welcome',0)">
								<span class="menu-content block">
									<span class="menu-icon"><i class="block fa fa-home fa-lg"></i></span>
									<span class="text m-left-sm">首页</span>
								</span>
								<span class="menu-content-hover block">
									首页
								</span>
							</a>
						</li>
						<c:set var="date" value="fa-hand-o-up" />
						<c:if test="${rsMenuList!=null}">
							<c:forEach items="${rsMenuList}" var="items" varStatus="idxStatus">

					    		<li id="menu_${idxStatus.index+1}" class="menu_list bg-palette${(idxStatus.index+1)%4+1}">
									<a href="javascript:;" onclick="open_menu('${items.mmUrl}','${idxStatus.index+1}')">
										<span class="menu-content block">
											<span class="menu-icon"><i class="block fa ${date} fa-lg"></i></span>
											<span class="text m-left-sm">${items.mmName}</span>
										</span>
										<span class="menu-content-hover block">
											${items.mmName}
										</span>
									</a>
								</li>
					    	</c:forEach>
						</c:if>
						
					</ul>
				</div>	
				<div class="sidebar-fix-bottom clearfix">
					<div class="user-dropdown dropup pull-left">
						<a href="#" class="dropdwon-toggle font-18" data-toggle="dropdown"><i class="ion-person-add"></i>
						</a>
						<ul class="dropdown-menu">
							<li>
								<a href="inbox.html">
									Inbox
									<span class="badge badge-danger bounceIn animation-delay2 pull-right">1</span>
								</a>
							</li>			  
							<li>
								<a href="#">
									Notification
									<span class="badge badge-purple bounceIn animation-delay3 pull-right">2</span>
								</a>
							</li>			  
							<li>
								<a href="#" class="sidebarRight-toggle">
									Message
									<span class="badge badge-success bounceIn animation-delay4 pull-right">7</span>
								</a>
							</li>			  	  
							<li class="divider"></li>
							<li>
								<a href="#">Setting</a>
							</li>			  	  
						</ul>
					</div>
					<a href="lockscreen.html" class="pull-right font-18"><i class="ion-log-out"></i></a>
				</div>
			</div><!-- sidebar-inner -->
		</aside>
		
		<div class="main-container">
			<div class="padding-md">
				<iframe id="mian" style="width: 100%;border: aliceblue;" scrolling="yes" src="<%=basePath %>manager/welcome">
			
				</iframe>

			</div><!-- ./padding-md -->
		</div><!-- /main-container -->

		<footer class="footer">
			<span class="footer-brand">
				<strong class="text-danger">易趣</strong>四点半
			</span>
			<p class="no-margin">
				&copy; 2018 <strong>易趣四点半管理平台</strong>. ALL Rights Reserved. 
			</p>	
		</footer>
	</div><!-- /wrapper -->

	<a href="#" class="scroll-to-top hidden-print"><i class="fa fa-chevron-up fa-lg"></i></a>

	<!-- Delete Widget Confirmation -->
	<div class="custom-popup delete-widget-popup delete-confirmation-popup" id="deleteWidgetConfirm">
		<div class="popup-header text-center">
			<span class="fa-stack fa-4x">
			  <i class="fa fa-circle fa-stack-2x"></i>
			  <i class="fa fa-lock fa-stack-1x fa-inverse"></i>
			</span>
		</div>
		<div class="popup-body text-center">
			<h5>Are you sure to delete this widget?</h5>
			<strong class="block m-top-xs"><i class="fa fa-exclamation-circle m-right-xs text-danger"></i>This action cannot be undone</strong>
		
			<div class="text-center m-top-lg">
				<a class="btn btn-success m-right-sm remove-widget-btn">Delete</a>
				<a class="btn btn-default deleteWidgetConfirm_close">Cancel</a>
			</div>
		</div>
	</div>
	
	<!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	
	<!-- Jquery -->
	<script src="<%=basePath %>platform/Simplify/js/jquery-1.11.1.min.js"></script>
	
	<!-- Bootstrap -->
    <script src="<%=basePath %>platform/bootstrap/js/bootstrap.min.js"></script>
  
  	<!-- layer-->
  	<script src="<%=basePath %>platform/layui/layui.js"></script>
  
	<!-- Flot -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.flot.min.js'></script>

	<!-- Slimscroll -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.slimscroll.min.js'></script>
	
	<!-- Morris -->
	<script src='<%=basePath %>platform/Simplify/js/rapheal.min.js'></script>	
	<script src='<%=basePath %>platform/Simplify/js/morris.min.js'></script>	

	<!-- Datepicker -->
	<script src='<%=basePath %>platform/Simplify/js/uncompressed/datepicker.js'></script>

	<!-- Sparkline -->
	<script src='<%=basePath %>platform/Simplify/js/sparkline.min.js'></script>

	<!-- Skycons -->
	<script src='<%=basePath %>platform/Simplify/js/uncompressed/skycons.js'></script>
	
	<!-- Popup Overlay -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.popupoverlay.min.js'></script>

	<!-- Easy Pie Chart -->
	<script src='<%=basePath %>platform/Simplify/js/jquery.easypiechart.min.js'></script>

	<!-- Sortable -->
	<script src='<%=basePath %>platform/Simplify/js/uncompressed/jquery.sortable.js'></script>

	<!-- Owl Carousel -->
	<script src='<%=basePath %>platform/Simplify/js/owl.carousel.min.js'></script>

	<!-- Modernizr -->
	<script src='<%=basePath %>platform/Simplify/js/modernizr.min.js'></script>
	
	<!-- Simplify -->
	<script src="<%=basePath %>platform/Simplify/js/simplify/simplify.js"></script>

	<script>
		$(function()	{
			$('.chart').easyPieChart({
				easing: 'easeOutBounce',
				size: '140',
				lineWidth: '7',
				barColor: '#7266ba',
				onStep: function(from, to, percent) {
					$(this.el).find('.percent').text(Math.round(percent));
				}
			});

			$('.sortable-list').sortable();

			$('.todo-checkbox').click(function()	{
				
				var _activeCheckbox = $(this).find('input[type="checkbox"]');

				if(_activeCheckbox.is(':checked'))	{
					$(this).parent().addClass('selected');					
				}
				else	{
					$(this).parent().removeClass('selected');
				}
			
			});

			//Delete Widget Confirmation
			$('#deleteWidgetConfirm').popup({
				vertical: 'top',
				pagecontainer: '.container',
				transition: 'all 0.3s'
			});
			
			//iframeAutoFit();
		});
		
		layui.use('layer', function(){  
	        var layer = layui.layer;   
		});
		
	</script>
	
	<script type="text/javascript">
	
	function open_menu(url,i){
		
		resetIframeAutoFit();
		
		$("#mian").attr("src",url);
		$(".menu_list").removeClass("active");
		$("#menu_"+i).addClass("active");
	}
	
	function logout(){
		$.ajax({
			type : "POST",
			dataType : "json",
			url : "<%=basePath%>manager/logout",
			success : function(data) {
				if (data.resultCode == -1) {
					alert(data.resultMsg);
				}
				if (data.resultCode == 1) {
					window.location.href = "<%=basePath %>manager";
				}
			},
			error : function(data) {
				// 输出错误信息;
				console.log(data.info);
			}
		});
	}
	
	function editPassword(){
       	var html="";
       	html += "<div class='padding-md'>";
		html += "<form class='form-horizontal'>";
		
		html += "<div class='form-group'>";
		html += "<label for='inputEmail1' class='col-lg-2 control-label'>原密码：</label>";
    	html += "<div class='col-lg-10'>";
		html += "<input id='old_password' name='old_password' class='form-control' type='password' value=''/>";
		html += "</div>";
		html += "</div>";
		
		html += "<div class='form-group'>";
        html += "<label for='inputEmail1' class='col-lg-2 control-label'>新密码：</label>";
        html += "<div class='col-lg-10'>";
		html += "<input id='new_password' name='new_password' class='form-control' type='password' value=''/>";
		html += "</div>";
        html += "</div>";
        
        html += "<div class='form-group'>";
        html += "<label for='inputEmail1' class='col-lg-2 control-label'>确认密码：</label>";
        html += "<div class='col-lg-10'>";
		html += "<input id='new_password_1' name='new_password_1' class='form-control' type='password' value=''/>";
        html += "</div>";
        html += "</div>";
        
        html += "<div class='form-group'>";
        html += "<div class='col-lg-offset-2 col-lg-10'>";
        html += "<button type='button' class='btn btn-success btn-sm' onclick='changeMyPassword()'>确定</button>";
        html += "</div>";
        html += "</div>";
        html += "</form>";
        html += "</div>";

       	layui.use('layer', function(){
			var layer = layui.layer;
	
			layer.open({
				type: 1,
				shadeClose: true,
				title: '修改密码',
				skin: 'layui-layer-rim', //加上边框
				area: ['600px', '300px'], //宽高
				content: html
			});
	
		});
       	
	}
	
	function changeMyPassword(){
		var old_password = $.trim($("#old_password").val());
		var new_password = $.trim($("#new_password").val());
		var new_password1 = $.trim($("#new_password_1").val());
		
		if(old_password==""){
			alert("请输入原密码");
			return false;
		}
		if(new_password==""){
			alert("请输入新密码");
			return false;
		}
		if(new_password1==""){
			alert("请输入确认密码");
			return false;
		}
		
		if(new_password!=new_password1){
			alert("两次输入新密码不一致，确认密码输入正确");
			return false;
		}
		
		$.ajax({
		    type : "POST",
		    dataType: "json",
		    url : "<%=basePath%>manager/updatePassword",
		    data:{"old_password":old_password,"new_password":new_password},
		    success : function(data) {
		        if(data.resultCode==1){
		        	alert(data.resultMsg);
		        	layer.closeAll();
		        }else{
		        	alert(data.resultMsg);
		        }
		        
		    },
		    error : function(data) {
		        // 输出错误信息;
		        console.log(data.info);
		    }
		});
	}
	
	function resetIframeAutoFit(){
		var windowHeight = $(window).height();
		var height = windowHeight-241;
		var ifr = $(window.document).find("#mian");
		ifr.height(height);
	}
	
	function iframeAutoFit(){
		var windowHeight = $(window).height();
		
		var height = windowHeight-140;
		
		var ifr = $(window.document).find("#mian");
		var innHeight = ifr.contents().find("html").height();
		
		if(height<innHeight){
			height = innHeight;
		}
		
		ifr.height(height);
	}

</script>
	
</body>
</html>
