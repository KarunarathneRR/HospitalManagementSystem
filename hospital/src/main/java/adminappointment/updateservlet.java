package adminappointment;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scheduleappointment.appointmentutill;

@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String id=request.getParameter("id");
		String doctor=request.getParameter("doctor");
		String pname=request.getParameter("patientname");
		String date=request.getParameter("date");
		boolean isTrue;
		isTrue=appointmentdbutill.upadteappointment(id, doctor, pname, date);
		if(isTrue==true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Upadate Successfully!');");
			out.println("location='adminappointment.jsp'");
			out.println("</script>");
		}else
		{
			out.println("<script type='text/javascript'>");
			out.println("alert('Update Failed!');");
			out.println("location='editadminappointment.jsp'");
			out.println("</script>");
		}
	}

}
