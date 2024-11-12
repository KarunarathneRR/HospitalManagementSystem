<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<header>
    <nav>
        <a href="home.jsp" style="font-family: Brush Script MT, Cursive; font-size: 40px">= MedicarePro.</a>

        <div class="right-links">
            <input type="text" placeholder="Search">
            <a href="profile.jsp"><img src="/OnlineHospitalManagementSystem/src/image/pp.png" alt="profile"></a>
            <a href="logout.jsp">Logout</a>
        </div>
    </nav>
    <style>
        nav {
            background-color: #007BFF;
            color: #fff;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 10px;
            margin-top: 0px;
        }

        .right-links {
            display: flex;
            align-items: center;
        }

        h1 {
            font-size: 34px;
            text-decoration: underline;
            font-family: "Papyrus", Cursive;
        }

        nav a {
            color: #fff;
            margin: 0px;
            text-decoration: none;
            padding: 10px 10px;
            font-size: 16px;
        }

        nav a:hover {
            background-color: #007BFF;
            color: #111;
            text-decoration: none;
        }

        nav input[type="text"] {
            padding: 8px;
            border: none; 
            border-radius: 10px;
            background-color: #f0f0f0;
            color: #333;
            outline: none;
            font-size: 16px;
            width: 200px;
            height: 40px;
        }

        nav input[type="text"]::placeholder {
            color: #aaa;
        }
    </style>
</header>
