<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="./save" modelAttribute="student" method="post">
		Id:<form:input path="id" placeholder="enter student id"/><br/>
		Name:<form:input path="name" placeholder="enter student name" /><br/>
		Course<form:input path="course" placeholder="enter student course" /><br/>
		<form:button>click</form:button>
	</form:form>
</body>
</html>
