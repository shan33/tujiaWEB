<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
  </head>
  
  <body>
  	<!-- 获取用户姓名 -->
   	<a href="user/getUserName">getUserName</a> <br>
   	
   	<!-- 获取用户信息 -->
   	<a href="user/getUser">getUser</a><br>
   
  	<!-- 注册 -->
   	<a href="user/add">addUser</a><br>
   	
   	<!-- 登录 -->
   	<a href="user/login">loginUser</a><br>
   	
   	<!-- 更新用户信息 -->
   	<a href="user/update">updateUser</a><br>
   	
   	<!-- 获取新的消息 -->
   	<a href="user/message">newMessages</a><br>
   	
   	
   	
   	<!-- 获取全部帖子 -->
   	<a href="post/all">allPost</a><br>
   	
   	<!-- 获取特定帖子信息 -->
   	<a href="post/info">specificInfo</a><br>
   	
   	<!-- 发布帖子 -->
   	<a href="post/post">post</a><br>
   	
   	<!-- 评论帖子 -->
   	<a href="post/comment">postComment</a><br>
   	
   	
   	
   	<!-- 获取特定文化板块信息 -->
   	<a href="culture/info">cultureInfo</a><br>
   	
   	<!-- 获取文化评论 -->
   	<a href="culture/comment">cultureComment</a><br>
   	
   	<!-- 获取文化板块更多信息 -->
   	<a href="culture/moreInfo">moreInfo</a><br>
   	
   	
   	
   	<!-- 上线文化产品 -->
   	<a href="market/addSale">addSale</a><br>
   	
   	<!-- 查看文化产品 -->
   	<a href="market/sales">sales</a><br>
   	<br>
  </body>
</html>
