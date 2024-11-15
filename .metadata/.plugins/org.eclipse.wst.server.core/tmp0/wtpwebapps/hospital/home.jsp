<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
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

        #content {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 20px auto;
            max-width: 600px;
        }

        h1 {
            color: #333;
        }

        p {
            font-size: 16px;
            color: #777;
        }

        div a {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: #fff;
            text-decoration: none;
            border-radius: 3px;
        }

        div a:hover {
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
<div id="content">
    <h1>MedicarePro</h1> <h4>Hospital Management System</h4><br>
    
    <c:choose>
        <c:when test="${sessionScope.user.role eq 'patient'}">
            <p>Welcome, ${sessionScope.user.username} (Patient). Here's your personalized content for patients.</p>
            <a href="appointment.jsp">Schedule an Appointment</a>
            <a href="medicalrecords.jsp">View Medical Records</a>
        </c:when>
        <c:when test="${sessionScope.user.role eq 'doctor'}">
            <p>Welcome, Dr. ${sessionScope.user.username}. Here's your personalized content for doctors.</p>
            <a href="doctorappointment.jsp">Manage Appointments</a>
            <a href="doctormedicalrecord.jsp">View Patient Records</a>
        </c:when>
        <c:when test="${sessionScope.user.role eq 'admin'}">
            <p>Welcome, Admin ${sessionScope.user.username}. Here's your admin panel content.</p>
            <a href="admindoctor.jsp">Add Doctor</a>
            <a href="adminpatient.jsp">Add Patient</a>
            <a href="adminappointment.jsp">Manage Appointments</a>
        </c:when>
        <c:otherWise>
            <p>Welcome, ${sessionScope.user.username}. Here's the default content for other users.</p>
        </c:otherWise>
    </c:choose>
</div>
<footer style="font-size:10px">
    &copy; 2023 MedicarePro Hospital Management System
</footer>
</body>
</html>
