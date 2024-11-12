<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        a {
            color: #007BFF;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        p {
            font-size: 18px;
            margin: 20px;
        }
    </style>
</head>
<body>
    <%
        HttpSession se = request.getSession();
        se.invalidate();
    %>
    <p>You have been successfully logged out.</p>
    <p><a href="login.jsp">Login Again</a></p>
</body>
</html>
