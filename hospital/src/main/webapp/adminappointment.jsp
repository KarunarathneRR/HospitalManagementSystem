<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Manage Appointments</title>
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

    a {
        text-decoration: none;
        color: #007BFF;
    }

    a:hover {
        text-decoration: underline;
    }



      .edit {
        
        background-color: #007BFF;
        color: #fff;
        padding: 5px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    .delete{
        background-color:red;
        color: #fff;
        padding: 5px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
    </style>
</head>
<body>
	<%@ include file="header.jsp" %>
    <h1>Manage Appointments</h1>
    
    
    <table>
        <tr><th>AppointmentId</th>
            <th>Doctor</th>
            <th>Patient</th>
            <th>Appointment Date</th>
            
        </tr>
      <c:forEach var="ap" items="${app}">
      <c:set var="id" value="${ap.id}"/>
      <c:set var="doctor" value="${ap.doctor}"/>
      <c:set var="name" value="${ap.patientname}"/>
       <c:set var="date" value="${ap.date}"/>
        <tr><td>${ap.id}</td>
            <td>${ap.doctor}</td>
            <td>${ap.patientname}</td>
            <td>${ap.date}</td>
            </c:forEach>
          
        </tr>
        
    </table>
    <c:url value="editadminappointment.jsp" var="apedit">
     <c:param name="id" value="${id}"/>
    <c:param name="doctor" value="${doctor}"/>
    <c:param name="pname" value="${name}"/>
    <c:param name="date" value="${date}"/>
    
    </c:url>
    <a href="${apedit}">
    <input type="button" name="edit" value="Edit" class="edit">

    </a> <br></br>
     <c:url value="deleteappointment.jsp" var="apdelete">
       <c:param name="id" value="${id}"/>
    <c:param name="doctor" value="${doctor}"/>
    <c:param name="pname" value="${name}"/>
    <c:param name="date" value="${date}"/>
    
    </c:url>
    <a href="${apdelete}">
    <input type="button" name="delete" value="Delete" class="delete">
    </a>
     <br></br>
	<footer style="font-size:10px">
        &copy; 2023 MedicarePro Hospital Management System
    </footer>
</body>
</html>
