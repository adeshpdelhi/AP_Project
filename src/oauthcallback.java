

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class oauthcallback
 */
@WebServlet("/oauthcallback")
public class oauthcallback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public oauthcallback() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	 } 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Check if the user have rejected 
	      String error = req.getParameter("error"); 
	      if ((null != error))
	    { 
	         HttpSession sess = req.getSession(); 
	         sess.invalidate(); 
	         resp.sendRedirect(req.getContextPath()); 
	         return; 
	      }
	      //OK the user have consented so lets find out about the user 
	      req.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
	      AsyncContext ctx = req.startAsync(); 
	      ctx.start(new GetUserInfo(req, resp, ctx)); 
	      req.getRequestDispatcher("Login_user_form").forward(req,resp);
	}

}
