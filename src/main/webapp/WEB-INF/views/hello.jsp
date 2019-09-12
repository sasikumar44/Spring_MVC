<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%> 

<html>
<head>
<meta charset="ISO-8859-1">
<title>My first Spring MVC</title>
</head>
<body>
	<h1>Hi this this hello from SPring MVC</h1>


	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");

		out.println("id :" + id);
		out.println("  name :" + name);
		out.println("  salary :" + salary);
	%>
 <br/>Id:
<b> ${id}</b>
name:
<b> ${name}</b>
salary:
<b> ${salary}</b>


<ul>
<li> ID : ${id}</li>
<li> Name : ${name}</li>
<li> Salary : ${salary}</li>
</ul>
</body>
</html>