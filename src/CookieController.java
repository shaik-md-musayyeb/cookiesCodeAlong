

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieController
 */
@WebServlet("/controller")
public class CookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CookieController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		//cookie
		Cookie ck = new Cookie("Username",name);
		response.addCookie(ck);
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("password", password);
		response.sendRedirect("result.jsp");
		
	}

}
