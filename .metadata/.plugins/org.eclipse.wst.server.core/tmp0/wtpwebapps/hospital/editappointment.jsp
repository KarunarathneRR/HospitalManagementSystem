<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Appointment </title>
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

        select, input[type="date"] {
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
        input[type="text"] {
            width: 90%;
            padding: 10px;
           
            border: 1px solid #ccc;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }

        table, th, td {
            border: 1px solid #ccc;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #007BFF;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        footer {
            margin-top: 20px;
            color: #777;
        }
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>
    <h1>Edit Appointment</h1>
    
  <%
    String doctor=request.getParameter("doctor");
    String pname=request.getParameter("pname");
    String date=request.getParameter("date");
    %>
    
    <form action="editservelet" method="post">
    <label for="doctor">Enter patient Name:</label>
    <input type="text" name="pname" value="<%= pname %>"></input>
        <label for="doctor">Select a Doctor:</label>
        <select name="doctor" required value="<%= doctor %>">
            <option value="doctor1">Doctor 1</option>
            <option value="doctor2">Doctor 2</option>
           
        </select><br>

        <label for="appointmentDate">Appointment Date:</label>
        <input type="date" name="appointmentDate" required value="<%= date %>"><br>

		<br>
        <input type="submit" value="Update Appointment">
    </form>
     <footer style="font-size: 10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
    
  