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
<a href="/">create new lead</a>
    <h2>List All Leads </h2>
      <table>
           <tr>
              <th>FirstName</th>
              <th>lastName</th>
              <th>source</th>
              <th> Email </th>
              <th> Mobile </th>
                
           </tr>
           
        <c:forEach var="lead" items = "${leads}">
			 <tr>
                 <td><a href="leadInfo?id=${lead.id}">${lead.firstname}</a></td>
                 <td>${lead.lastName}</td>
                 <td>${lead.source}</td>
                 <td>${lead.email} </td>
                 <td>${lead.mobile}</td>    
              </tr>
              
		</c:forEach>

	</table>
	${msg}
</body>
</html>