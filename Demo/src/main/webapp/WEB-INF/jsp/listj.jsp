
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>this thsdfsand</p>
<c:forEach var="ls" items="${person}" >
<br/>
${ls}
<br/>
</c:forEach>
<p>this thsdfsand</p>
<c:forEach var="ls" items="${pro}" >
<br/>
${ls}
<br/>
</c:forEach>



<c:forEach var="al" items="${all}">
${al}
</c:forEach>



</body>
</html>