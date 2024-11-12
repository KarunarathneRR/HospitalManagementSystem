package addpatient;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/patientservlet")
public class patientservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String firstname=request.getParameter("firstName");
		String surname=request.getParameter("surname");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String emaile=request.getParameter("email");
		String contactNumber=request.getParameter("contactNumber");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
   boolean isTrue;
		
		isTrue = patientutill.insertpatient(firstname, surname, gender, address, emaile, contactNumber, username, password);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Registation Successfully!');");
			out.println("location='adminpatient.jsp'");
			out.println("</script>");
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Registation Failed');");
			out.println("location='adminpatient.jsp'");
			out.println("</script>");
		}
		
	}

}
