<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Medical Record</title>
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
            width: 600px;
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
        input[type="date"],
        textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        textarea {
            height: 80px;
        }

        input type="text" {
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
            font-size: 10px;
        }
    </style>
</head>
<body>
<%@ include file="header.jsp" %>
    <h1>Add Medical Record</h1>
    
    <form action="addmedicalrecordservlet" method="post">
        <label for="date">Date:</label>
        <input type="date" name="date" required><br>

        <label for="patient">Patient:</label>
        <input type="text" name="patient" required><br>

        <label for="diagnosis">Diagnosis:</label>
        <input type="text" name="diagnosis" required><br>

        <label for="treatment">Treatment:</label>
        <input type="text" name="treatment" required><br>

        <label for="notes">Notes:</label>
        <textarea name="notes" rows="4" required></textarea>

        <br><br>
        <input type="submit" value="Add Medical Record">
    </form>
    <footer style="font-size: 10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
