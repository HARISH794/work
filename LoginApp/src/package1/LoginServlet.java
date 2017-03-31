package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userId, password;
		
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		
		LoginService loginservice = new LoginService();
		boolean result = loginservice.authenticate(userId, password); 
		
		if(result){
			
		User user = LoginService.getUser(userId);
			
			
			response.sendRedirect("success.jsp");
			request.getSession().setAttribute("user", user);
			return;
		}
		else{
			response.sendRedirect("login.jsp");
		}
		
		
		
		
		
		
		
		
		
	}

}
