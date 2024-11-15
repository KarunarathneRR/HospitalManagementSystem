<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Appointments</title>
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
         font-size: 34px;
            text-decoration: underline;
            font-family: "Papyrus", Cursive;
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

    .form-col {
        width: 50%;
        float: left;
        box-sizing: border-box;
        padding: 10px;
    }

    label {
        display: block;
        text-align: left;
        margin-top: 10px;
    }

    input[type="text"],
    input[type="Date"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    input[type="Date"] {
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
    <h1>Edit Appointments</h1>
    <%
    String doctor=request.getParameter("doctor");
    String pname=request.getParameter("pname");
    String date=request.getParameter("date");
    %>
    
    <form action="updateservlet" method="post">
        <div class="form-col">
            <label for="doctor">Doctor Name:</label>
            <input type="text" name="doctor" value="<%=doctor %>" required><br>
            
            <label for="patientname">Patient name:</label>
            <input type="text" name="patientname" value="<%=pname %>" required><br>
            
            <label for="date">Date:</label>
            <input type="Date" name="date" value="<%=date %>" >
        </div>
        
        <br>
        <input type="submit" value="Confirm" name="submit">
    </form>
   
    <footer style="font-size: 10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
