package adminappointment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteservelet")
public class deleteservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue=appointmentdbutill.deleteappointment(id);
		if(isTrue==true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Successfully!');");
			out.println("location='adminappointment.jsp'");
			out.println("</script>");
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete UnSuccessfully!');");
			out.println("location='adminappointment.jsp'");
			out.println("</script>");
		}
	}

}
