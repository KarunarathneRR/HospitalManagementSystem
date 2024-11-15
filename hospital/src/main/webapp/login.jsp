<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        
        nav {
            background-color: #007BFF;
            color: #fff;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 10px;
            margin-top: 0px;
        }

        h1 {
            font-size: 34px;
            text-decoration: underline;
            font-family: "Papyrus", Cursive;
            color: #333;
        }

        nav a {
            color: #fff;
            margin: 0px;
            text-decoration: none;
            padding: 10px 10px;
            font-size: 16px;
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
            width: 90%;
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

	<nav>
        <a href="#" style="font-family: Brush Script MT, Cursive; font-size: 40px">= MedicarePro.</a>
    </nav>
    <h1>User Login</h1>
    
    <form action="loginservlet" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" required><br>

        <label for="password">Password:</label>
        <input type="password" name "password" required>
		
		<label><a href="forget.html" style="color: #007BFF; font-size: 13px">Forget Password?</a></label>
		
        <input type="submit" value="Login">
        <a href="register.jsp" style="color: #007BFF; font-size: 13px">Register</a>
        
    </form>
    <footer style="font-size:10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
