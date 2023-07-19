<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
</head>
<body>
      <h1> Generate | Bill</h1>
      <form action="generatebill" method="post">
      <pre>
         First Name<input type="text" name="firstname" value="${contact.firstName}"/>
         Last Name<input type="text" name="lastName" value="${contact.lastName}"/>
         Email<input type="email" name="email" value="${contact.email}" />
         Mobile<input type="text" name="mobile" value="${contact.mobile}"/>
         Product Name<input type="text" name="productName"/>
         Amount<input type="number" name="amount"/>
         <input type="submit" value="Generate"/>
         </pre>
      </form>
</body>
</html>