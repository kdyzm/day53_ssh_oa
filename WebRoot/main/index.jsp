<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>Insert title here !</title>
  </head>
  
  <body>
    SSH测试，如果跳转到该页面表示测试成功！<br/>
    ${requestScope.user}
  </body>
</html>
