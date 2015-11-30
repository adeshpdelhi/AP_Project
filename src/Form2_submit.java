

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form2_submit
 */
@WebServlet("/Form2_submit")
public class Form2_submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2_submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Form2_submit");
		Cookie cXBoard=new Cookie("XBoard",request.getParameter("XBoard"));
		Cookie cXMarks=new Cookie("XMarks",request.getParameter("XMarks"));
		Cookie cXYear=new Cookie("XYear",request.getParameter("XYear"));
		Cookie cXIIBoard=new Cookie("XIIBoard",request.getParameter("XIIBoard"));
		Cookie cXIIMarks=new Cookie("XIIMarks",request.getParameter("XIIMarks"));
		Cookie cXIIYear=new Cookie("XIIYear",request.getParameter("XIIYear"));
		Cookie cdegree=new Cookie("degree",request.getParameter("degree"));
		Cookie cdept=new Cookie("dept",request.getParameter("dept"));
		Cookie ccollege=new Cookie("college",request.getParameter("college"));
		Cookie cuniversity=new Cookie("university",request.getParameter("university"));
		Cookie ccity=new Cookie("city",request.getParameter("city"));
		Cookie cstate=new Cookie("state",request.getParameter("state"));
		Cookie cgrad_year=new Cookie("grad_year",request.getParameter("grad_year"));
		Cookie ccorm=new Cookie("corm",request.getParameter("corm"));
		Cookie ccgpa=new Cookie("cgpa",request.getParameter("cgpa"));
		Cookie ctotal_cgpa=new Cookie("total_cgpa",request.getParameter("total_cgpa"));
		Cookie cmarks=new Cookie("marks",request.getParameter("marks"));
		response.addCookie(cXBoard);response.addCookie(cXIIBoard);response.addCookie(cXMarks);response.addCookie(cXIIMarks);response.addCookie(cXYear);response.addCookie(cXIIYear);response.addCookie(cdegree);response.addCookie(cdept);response.addCookie(ccollege);response.addCookie(cuniversity);response.addCookie(ccity);response.addCookie(cstate);response.addCookie(cgrad_year);response.addCookie(ccorm);response.addCookie(ccgpa);response.addCookie(cmarks);response.addCookie(ctotal_cgpa);
		System.out.println("File CV: "+request.getParameter("upload_cv"));
		System.out.println("File SOP: "+request.getParameter("upload_sop"));
		//request.getRequestDispatcher("Submit_form").forward(request, response);
		response.sendRedirect("Submit_form");
	}

}
