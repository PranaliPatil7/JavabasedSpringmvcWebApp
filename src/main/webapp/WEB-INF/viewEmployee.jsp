<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
   %>


<jsp:useBean id="employee" class="com.prowings.model.Employee" scope="request" />
<jsp:setProperty name="employee" property="*" />

<!DOCTYPE html>
<html>
<head>
	<title>Employee Details</title>
</head>
<body>
	<h1>Employee Details</h1>
	<p>Employee id:<c:out value="${employee.id}"/></p>
	<p>Employee name:<c:out value="${employee.name}"/></p>
	<p>Employee phone:<c:out value="${employee.phone}"/></p>
	
</body>
</html>