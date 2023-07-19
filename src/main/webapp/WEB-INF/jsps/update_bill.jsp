<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GEnerate Bill</title>
</head>
<body>
      <h1>Update Your Bill</h1>
      <form action="updatebill" method="post">
      <pre>
      	<input type="hidden" name="id" value="${bill.id}"></input>
         First Name<input type="text" name="firstname" value="${bill.firstname}"/>
         Last Name<input type="text" name="lastName" value="${bill.lastName}"/>
         Email<input type="email" name="email" value="${bill.email}" />
         Mobile<input type="text" name="mobile" value="${bill.mobile}"/>
         Product Name<input type="text" name="productName"/>
         Amount<input type="number" name="amount"/>
         <input type="submit" value="Update Bill"/>
         </pre>
      </form>
</body>
</html>