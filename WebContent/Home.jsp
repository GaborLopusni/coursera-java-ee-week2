<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Handling forward</title>
</head>
<body>

<p>Welcome to our site</p>
<ul>
    <li><b>First name</b>:<%=request.getParameter("first_name") %></li>
    <li><b>Last name</b>: <%=request.getParameter("last_name") %></li>
</ul>
<a href="WelcomeServlet?redirect=yes">Redirect</a>
</body>
</html>