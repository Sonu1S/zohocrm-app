<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LEd info</title>
</head>
<body>
     <h2>Lead | Information </h2>
       Lead Id: ${lead.id}<br>
       First Name: ${lead.firstname}<br>
       Last Name: ${lead.lastName}<br>
       Source: ${lead.source}<br>
       Email : ${lead.email}<br>
       Mobile : ${lead.mobile}<br>
       <!-- Put on a button -->
       <form action="convertLead" method="post">
       <input type ="hidden" name="id" value ="${lead.id}"/>
             <input type ="submit" value = "convert"/>
       </form>
       
</body>
</html>