<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Medical Records</title>
    <style>
      
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

        h1 {
            color: #333;
            margin: 20px 0;
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
    <h1>Medical Records</h1>
    
    <table>
        <tr>
        <th>PatientID</th>
            <th>Date</th>
            <th>Doctor</th>
            <th>Diagnosis</th>
            <th>Treatment</th>
            <th>Notes</th>
            
        </tr>
        <c:forEach var="record" items="${medicalRecords}">
            <tr>
                <td>${record.date}</td>
                <td>${record.doctor}</td>
                <td>${record.diagnosis}</td>
                <td>${record.treatment}</td>
                <td>${record.notes}</td>
                
            </tr>
        </c:forEach>
    </table>
    <footer style="font-size:10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
