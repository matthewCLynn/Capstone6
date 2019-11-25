<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Manager Login</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css" rel="stylesheet" integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu" crossorigin="anonymous">
${tryAgain}
<form action ="new-user">
Email: <input name="email" type="text">
Password: <input name="password" type="password">
Confirm Password: <input name="password2" type="password">
<input class="btn btn-secondary" type="submit" value = "Create account">
</form>

</head>
<body>
<h3>Already have an Account? Log In!</h3>
<form action="old-user">
Email: <input name="email" type="text">
Password: <input name="password" type="text">
<input class="btn btn-secondary" type="submit" value = "Log In">
</form>
</body>
</html>