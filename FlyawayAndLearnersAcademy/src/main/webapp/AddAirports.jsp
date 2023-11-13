<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;width:100%">New Customer Details</h1>
<form method="post" action="AddAirports">
<p style="text-align:center;width:100%">
<input type="text" name="txtAid" placeholder="Enter Airport ID" required/> 
<input type="text" name="txtAname" placeholder="Enter Airport Name" required/>
<input type="text" name="txtAcity" placeholder="Enter Airport City" required/>
<input type="text" name="txtAcountry" placeholder="Enter Airport Country" required/>
<input type="submit" value="Click Me"/>
</form>
</body>
</html>