<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class UserProfileServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Extract form parameters for updating user profile
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        // ... Extract other form parameters

        // Database connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String dbUser = "your_username";
        String dbPassword = "your_password";

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Create SQL query to update user data
            String updateQuery = "UPDATE users SET email=?, ... WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, email);
            // ... Set other parameters
            preparedStatement.setString(n, username); // Set the WHERE clause parameter

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database connection
            preparedStatement.close();
            connection.close();

            if (rowsAffected > 0) {
                // Profile update successful, display a success alert
                PrintWriter out = response.getWriter();
                out.println("<script>alert('Profile update successful');</script>");
                out.println("<script>location.href='profile.jsp';</script>");
            } else {
                // Profile update failed, display an error alert
                PrintWriter out = response.getWriter();
                out.println("<script>alert('Profile update failed');</script>");
                out.println("<script>location.href='profile.jsp';</script>");
            }
        } catch (SQLException e) {
            // Handle database errors
            e.printStackTrace();
        }
    }
}
