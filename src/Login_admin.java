

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_admin
 */
@WebServlet("/Login_admin")
public class Login_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username=null,password=null;
		if(request.getParameter("admin_username")!=null && request.getParameter("admin_password")!=null)
		{	System.out.println("crentials not null");
			username=request.getParameter("admin_username");
			password=request.getParameter("admin_password");
			System.out.println(username+" "+password);

		}
		int flag=0;
		//if(((username.equals("admin"))==true) && ((password.equals("admin123"))==true))
		{
			flag=1;
		}
		if(flag==1)
			request.getRequestDispatcher("filter1.html").include(request, response);
		else
		{
			String error="Invalid credentials";
		request.getRequestDispatcher("Login_admin_form").forward(request, response);
}
		//request.getRequestDispatcher("Login_Admin.html").include(request, response);
	}

}
