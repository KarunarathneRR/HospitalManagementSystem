<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Doctor</title>
    <style>
        {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            margin: 20px 0;
        }

        form {
            width: 300px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            text-align: left;
            margin-top: 10px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        footer {
            margin-top: 20px;
            color: #777;
        }
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>
    <h1>Add Doctor</h1>
    
    <form action="adddoctorservlet" method="post">
        <label for="name">Doctor's Name:</label>
        <input type="text" name="name" required><br>

        <label for="specialization">Specialization:</label>
        <input type="text" name="specialization" required><br>
        
        <label for="username">Username:</label>
        <input type="text" name="username" required><br>
        
        <label for="password">Password:</label>
        <input type="password" name="password" required><br>

        <!-- Add more fields for contact information, etc. -->
		<br>
        <input type="submit" value="Add Doctor">
    </form>
    <footer style="font-size:10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
