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
    
    <title>welcome SEARCH</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>platform/searchBar/css/search-form.css">
	
	<!--[if IE]>
		<script src="http://libs.baidu.com/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->
  </head>
  
  
  
	<body>
		<section class="container">
			<form onsubmit="submitFn(this, event);">
	            <div class="search-wrapper">
	                <div class="input-holder">
	                    <input type="text" class="search-input" placeholder="Type to search" />
	                    <button class="search-icon" onclick="searchToggle(this, event);"><span></span></button>
	                </div>
	                <span class="close" onclick="searchToggle(this, event);"></span>
	                <div class="result-container">
	
	                </div>
	            </div>
	        </form>
		</section>
		
		<script src="<%=basePath%>platform/searchBar/js/jquery-1.11.0.min.js"></script>
		<script>window.jQuery || document.write('<script src="<%=basePath%>platform/searchBar/js/jquery-1.11.0.min.js"><\/script>')</script>
		<script type="text/javascript">
	        function searchToggle(obj, evt){
	            var container = $(obj).closest('.search-wrapper');
	
	            if(!container.hasClass('active')){
	                  container.addClass('active');
	                  evt.preventDefault();
	            }
	            else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){
	                  container.removeClass('active');
	                  // clear input
	                  container.find('.search-input').val('');
	                  // clear and hide result container when we press close
	                  container.find('.result-container').fadeOut(100, function(){$(this).empty();});
	            }
	        }
	
	        function submitFn(obj, evt){
	            value = $(obj).find('.search-input').val().trim();
	
	            _html = "Yup yup! Your search text sounds like this: ";
	            if(!value.length){
	                _html = "Yup yup! Add some text friend :D";
	            }
	            else{
	                _html += "<b>" + value + "</b>";
	            }
	
	            $(obj).find('.result-container').html('<span>' + _html + '</span>');
	            $(obj).find('.result-container').fadeIn(100);
	
	            evt.preventDefault();
	        }
	    </script>
	</body>
</html>
