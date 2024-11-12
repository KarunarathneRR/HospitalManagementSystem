package scheduleappointment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scheduleinsertservlet")
public class scheduleinsertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String pname=request.getParameter("pname");
		String doctor=request.getParameter("doctor");
		String date=request.getParameter("date");
		
boolean isTrue;
		
        isTrue=appointmentutill.insertappointment(pname, doctor, date)	;	
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Add Appointment Successfully!');");
			out.println("location='appointment.jsp'");
			out.println("</script>");
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Add Appointment Failed');");
			out.println("location='appointment.jsp'");
			out.println("</script>");
		}
		
	
	}

}
