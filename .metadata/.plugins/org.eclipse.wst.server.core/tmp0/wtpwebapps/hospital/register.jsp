<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Registration</title>
   <style>
        /* Reset some default styles */
        * {
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
            margin: 20px 0;
        }
 
        nav a {
            color: #fff;
            margin: 0px;
            text-decoration: none;
            padding: 10px 10px;
            font-size: 16px;
        }
 
        form {
            width: 600px; /* Set the total width of the form */
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
 
        .form-col {
            width: 50%; /* Each column takes 50% width */
            float: left; /* Float columns left to create the two-column layout */
            box-sizing: border-box; /* Include padding and border in the width */
            padding: 10px;
        }
 
        label {
            display: block;
            text-align: left;
            margin-top: 10px;
        }
 
        input[type="text"],
        input[type="password"],
        input[type="email"],
        input[type="tel"],
        select,
        textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
 
        textarea {
            height: 80px; /* Set the desired height (4 rows) */
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
 
        .checkbox-container {
            display: block;
            text-align: left;
            margin-top: 10px;
        }
 
        .checkbox-container input {
            display: inline;
            margin-right: 5px;
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
    <h1>User Registration</h1>
    
    <form action="registerservlet" method="post">
        <div class="form-col">
            <label for="firstName">First Name:</label>
            <input type="text" name="firstName" required><br>
            
            <label for="surname">Surname:</label>
            <input type="text" name="surname" required><br>
            
            <label for="gender">Gender:</label>
            <select name="gender" required>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select><br>
            
            <label for="address">Address:</label>
            <textarea name="address" rows="4" required></textarea><br>
            
            <div class="checkbox-container">
                <input type="checkbox" id="terms" required>
                Agree to <a href="terms.html"  style="color: #007BFF">terms</a> & <a href="condition.html"  style="color: #007BFF">conditions.</a></input>
            </div>
        </div>
        <div class="form-col">
            <label for="email">Email:</label>
            <input type="email" name="email" required><br>
            
            <label for="contactNumber">Contact Number:</label>
            <input type="tel" name="contactNumber" required><br>
            
            <label for="username">Username:</label>
            <input type="text" name="username" required><br>
            
            <label for="password">Password:</label>
            <input type="password" name="password" required><br>
            
            <label for="confirmPassword">Re-enter Password:</label>
            <input type="password" name="confirmPassword" required><br>
        </div>
        
        <br>
        <input type="submit" value="Register">
        <p style="font-size: 13px">Already have an account <a href="login.jsp" style="color: #007BFF">Login</a></p>
    </form>
    <footer style="font-size: 10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
