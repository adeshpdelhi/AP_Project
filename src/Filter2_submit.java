

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Filter2_submit
 */
@WebServlet("/Filter2_submit")
public class Filter2_submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Filter2_submit() {
        super();
        // TODO Auto-generated constructor stub
    }
    void getdetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	//Cookie cemail,cname,cenrollno,ccorr_address,cmobile,cphd,cphd1,cphd2,cphd3,cgender,ccategory,cphydis,cdob,cdefence,cfather,cnationality,cperm_address,cpin;
    	HttpSession session=request.getSession(false);  
       
        session.setAttribute("stream",request.getParameter("fstream"));
        session.setAttribute("grad_degree",request.getParameter("fgrad_degree"));
        session.setAttribute("pg_degree",request.getParameter("fpg_degree"));
        session.setAttribute("xboard",request.getParameter("fxboard"));
        session.setAttribute("xiiboard",request.getParameter("fxiiboard"));
        session.setAttribute("grad_dep",request.getParameter("fgrad_dep"));
        session.setAttribute("pg_dep",request.getParameter("fpg_dep"));
        if(request.getParameter("fgrad_univ").length()!=0)
        	session.setAttribute("grad_univ",request.getParameter("fgrad_univ"));
        else
        	session.setAttribute("grad_univ","\0");
        if(request.getParameter("fpg_univ").length()!=0)
        	session.setAttribute("pg_univ",request.getParameter("fpg_univ"));
        else
        	session.setAttribute("pg_univ","\0");
        session.setAttribute("grad_state",request.getParameter("fgrad_state"));
        session.setAttribute("pg_state",request.getParameter("fpg_state"));
        
        session.setAttribute("x_lt",request.getParameter("fx_lt"));
        session.setAttribute("x_eq",request.getParameter("fx_eq"));
        session.setAttribute("x_gt",request.getParameter("fx_gt"));
        session.setAttribute("xii_lt",request.getParameter("fxii_lt"));
        session.setAttribute("xii_eq",request.getParameter("fxii_eq"));
        session.setAttribute("xii_gt",request.getParameter("fxii_gt"));
        session.setAttribute("grad_lt",request.getParameter("fgrad_lt"));
        session.setAttribute("grad_eq",request.getParameter("fgrad_eq"));
        session.setAttribute("grad_gt",request.getParameter("fgrad_gt"));
        session.setAttribute("pg_lt",request.getParameter("fpg_lt"));
        session.setAttribute("pg_gt",request.getParameter("fpg_eq"));
        session.setAttribute("pg_gt",request.getParameter("fpg_gt"));
        session.setAttribute("gate_lt",request.getParameter("fgate_gt"));
        session.setAttribute("gate_eq",request.getParameter("fgate_eq"));
        session.setAttribute("gate_gt",request.getParameter("fgate_lt"));
        
        
		
        if(request.getParameter("fx_percent").length()!=0)
        	session.setAttribute("x_percent",request.getParameter("fx_percent"));
        else
        	session.setAttribute("x_percent","\0");
        if(request.getParameter("fxii_percent").length()!=0)
        	session.setAttribute("xii_percent",request.getParameter("fxii_percent"));
        else
        	session.setAttribute("xii_percent","\0");
        if(request.getParameter("fgrad_percent").length()!=0)
        	session.setAttribute("grad_percent",request.getParameter("fgrad_percent"));
        else
        	session.setAttribute("grad_percent","\0");
        if(request.getParameter("fpg_percent").length()!=0)
        	session.setAttribute("pg_percent",request.getParameter("fpg_percent"));
        else
        	session.setAttribute("pg_percent","\0");
        if(request.getParameter("fgate_score").length()!=0)
        	session.setAttribute("gate_score",request.getParameter("fgate_score"));
        else
        	session.setAttribute("gate_score","\0");

//		
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

		getdetails(request,response);
//    	HttpSession session=request.getSession();  
//    	session.setAttribute("errors","");
//    	System.out.println("In filter2_submit");
//    	String chk=(String)request.getParameter("fx_lt");
//    	System.out.println("Checkbox11====== "+chk);
//    	String chk1=(String)request.getParameter("fx_eq");
//    	System.out.println("Checkbox22====== "+chk1);
		System.out.println("in filter2_submit");

		request.getRequestDispatcher("Filter3").forward(request, response);


	}

}
