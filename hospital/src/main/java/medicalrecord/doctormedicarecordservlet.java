package medicalrecord;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/doctormedicarecordservlet")
public class doctormedicarecordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String patientId = request.getParameter("patientId");
	        List<medicalrecords> medicalRecord = medicalrecorddbutill.getmedicalrecords(patientId);

	        request.setAttribute("medicalRecord", medicalRecord);

	       
	        String destination = "medicalrecords.jsp";
	        ServletContext servletContext = getServletContext();
	        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/" + destination);
	        requestDispatcher.forward(request, response);
	    }
}
