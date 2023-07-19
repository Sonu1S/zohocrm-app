<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
      <h1> Lead | Create</h1>
      <form action="saveLead" method="post">
      <pre>
         First Name<input type="text" name="firstname"/>
         Last Name<input type="text" name="lastName"/>
         Source
         <select name="source">
			<option value="news paper">news paper</option>
			<option value="radio">radio</option>
			<option value="tv coomercial">tv coomercial</option>
			<option value="audi">Audi</option>
		 </select> 
         Email<input type="email" name="email"/>
         Mobile<input type="text" name="mobile"/>
         <input type="submit" value="save" />
         </pre>
      </form>
</body>
</html>