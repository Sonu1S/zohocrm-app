<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
    <!--This for JSTL tag  -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all</title>
</head>
<body>
    <h2>List All Leads </h2>
      <table>
           <tr>
              <th>FirstName</th>
              <th>lastName</th>
              <th> Email </th>
              <th> Mobile </th>
              <th> Billing </th> 
           </tr>
           
        <c:forEach var="contact" items = "${contacts}">
			 <tr>
                 <td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
                 <td>${contact.lastName}</td>
                 <td>${contact.email} </td>
                 <td>${contact.mobile}</td>   
                 <td><a href="showGenerateBillPage?id=${contact.id}"> create bill</a></td>       
              </tr>
              
		</c:forEach>

	</table>
	${msg}
</body>
</html>