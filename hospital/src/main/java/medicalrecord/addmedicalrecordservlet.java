package medicalrecord;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addmedicalrecordservlet")
public class addmedicalrecordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String date=request.getParameter("date");
		String patient=request.getParameter("patient");
		String diagnosis=request.getParameter("diagnosis");
		String treatment=request.getParameter("treatment");
		String notes=request.getParameter("notes");
		
		   boolean isTrue;
			
			isTrue = medicalrecorddbutill.insertpatientrecords(date, patient, diagnosis, treatment, notes);
			
			if(isTrue == true) {
				out.println("<script type='text/javascript'>");
				out.println("alert('Medical Record Adding Successfully!');");
				out.println("location='doctormedicalrecord.jsp'");
				out.println("</script>");
			} else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Medical Record Adding Failed');");
				out.println("location='addmedicalrecord.jsp'");
				out.println("</script>");
			}
			
	}

}