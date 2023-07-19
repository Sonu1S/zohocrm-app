<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List All Bills</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>amount</th>
			<th>email</th>
			<th>mobile</th>
			<th>Product Name</th>
			<th>delete</th>
			<th> Update</th>
		</tr>
		<c:forEach var="bill" items = "${bills}">
			<tr>
				<td>${bill.id}</td>
				<td>${bill.firstname}</td>
				<td>${bill.lastName}</td>
				<td>${bill.amount}</td>
				<td>${bill.email}</td>
				<td>${bill.mobile}</td>
				<td>${bill.productName}</td>
				<td><a href="delete?id=${bill.id}">delete</a></td>
				<td><a href="update?id=${bill.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>