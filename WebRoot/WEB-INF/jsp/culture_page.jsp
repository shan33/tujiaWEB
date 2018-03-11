<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>CulturePage</title>
    <link href="<c:url value="/css/ionic.min.css"></c:url>"  rel="stylesheet">
    
    <script src='<c:url value="/js/ionic.bundle.min.js"></c:url>'></script>
    <script src='<c:url value="/js/culture.js"></c:url>'></script>
    
  </head>
  <body ng-app="culture" ng-controller="cultureCtrl">
  	
  </body>
  
</html>
