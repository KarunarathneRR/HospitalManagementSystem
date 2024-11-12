package doctorappointment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminappointment.appointmentdbutill;

@WebServlet(name = "doctorappointmetservelet", urlPatterns = { "/doctorappointmetservelet" })
public class doctorappointmetservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean app=appointmentdbutill.validate();
			request.setAttribute("app", app);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
