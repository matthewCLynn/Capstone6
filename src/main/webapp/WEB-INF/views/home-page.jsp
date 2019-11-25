<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css" rel="stylesheet" integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu" crossorigin="anonymous">
Not ${user.email }? <a class ="btn btn-primary" href= "/" value="Log Out">Log Out</a>
</head>
<body>
<h3>Enter a task</h3>
<form action="home-page">
<input name="email" value="${user.email }" type="hidden">
<input name="password" value="${user.password }" type="hidden">
<input name="id" value="${user.id}" type="hidden">
Task Description: <input name="tDescription" type="text">
Task Due Date: <input name="tDueDate" type="text">
<input name= "tComplete" type= "hidden" value = "false">
<input class="btn btn-secondary" type="submit" value = "Add Task">
</form>

<ol>
<c:forEach var ="taskTable" items = "${taskList }">
<li> ${taskTable}

</c:forEach>
</ol>
</body>
</html>