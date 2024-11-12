package scheduleappointment;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "scheduleservlet", urlPatterns = { "/scheduleservlet" })
public class scheduleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean app=appointmentutill.validate();
			request.setAttribute("app", app);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
