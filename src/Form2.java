

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form2
 */
@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
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
	void generateNew(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		out.println("<html><head><style> h3 { display: inline; } input { display: inline-block;} </style> <link rel=\"stylesheet\" type=\"text/css\" href=\"style_menu.css\"> </head> <body> <div id=\"form2\"> <form action=\"Form2_submit\" method=\"POST\" enctype=\"multipart/form-data\"> <h1><center>Educational Information</center></h1> <p><h3><u>Enter the required fields</u></h3></p> <br><br> <p><h3>Xth Board*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"XBoard\" id=\"XBoard\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tXBoard\"></span></p> <p><h3>Xth Marks (%)*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"XMarks\" name=\"XMarks\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tXMarks\"></span></p> <p><h3>Year of Passing Xth*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name=\"XYear\" id=\"XYear\"><option value=\"\" selected=\"selected\">---------</option><option value=\"2013\" selected=\"selected\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select></p> <p> <h3>XIIth Board*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"XIIBoard\" id=\"XIIBoard\"><span id=\"tXIIBoard\"></span></p> <p><h3>XIIth Marks(%)*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"XIIMarks\" id=\"XIIMarks\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tXIIMarks\"></span></p> <p><h3>Year of Passing XIIth*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name=\"XIIYear\" id=\"XIIYear\"><option value=\"2015\" selected=\"selected\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\" selected=\"selected\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select></p> <p><h3>Degree*</h3></label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"degree\" id=\"degree\"><span id=\"tdegree\"></span></p> <p><h3>Department/Discipline*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"dept\" id=\"dept\"><span id=\"tdept\"></span></p> <p><h3>Name of College*</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"college\" id=\"college\"><span id=\"tcollege\"></span></p> <p><h3>Name of University*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"university\" id=\"university\"><span id=\"tuniversity\"></span></p> <p><h3>City*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"city\" id=\"city\"><span id=\"tcity\"></span></p> <p><h3>State*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name=\"state\" id=\"state\"><option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option><option value=\"Andhra Pradesh\">Andhra Pradesh</option><option value=\"Arunachal Pradesh\">Arunachal Pradesh</option><option value=\"Assam\">Assam</option><option value=\"Bihar\">Bihar</option><option value=\"Chandigarh\">Chandigarh</option><option value=\"Chhatisgarh\">Chhatisgarh</option><option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option><option value=\"Daman and Diu\">Daman and Diu</option><option value=\"Delhi\" selected=\"selected\">Delhi</option><option value=\"Goa\">Goa</option><option value=\"Gujarat\">Gujarat</option><option value=\"Haryana\">Haryana</option><option value=\"Himachal Pradesh\">Himachal Pradesh</option><option value=\"Jammu and Kashmir\">Jammu and Kashmir</option><option value=\"Jharkhand\">Jharkhand</option><option value=\"Karnataka\">Karnataka</option><option value=\"Kerala\">Kerala</option><option value=\"Lakshadweep\">Lakshadweep</option><option value=\"Madhya Pradesh\">Madhya Pradesh</option><option value=\"Maharashtra\">Maharashtra</option><option value=\"Manipur\">Manipur</option><option value=\"Meghalaya\">Meghalaya</option><option value=\"Mizoram\">Mizoram</option><option value=\"Nagaland\">Nagaland</option><option value=\"Orissa\">Orissa</option><option value=\"Pondicherry\">Pondicherry</option><option value=\"Punjab\">Punjab</option><option value=\"Rajasthan\">Rajasthan</option><option value=\"Sikkim\">Sikkim</option><option value=\"Tamil Nadu\">Tamil Nadu</option><option value=\"Tripura\">Tripura</option><option value=\"Uttaranchal\">Uttaranchal</option><option value=\"Uttar Pradesh\">Uttar Pradesh</option><option value=\"West Bengal\">West Bengal</option><option value=\"Other\">Other</option></select></p> <p><h3>Year of Graduation*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name=\"grad_year\" id=\"grad_year\"><option value=\"2015\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\" selected=\"selected\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select></p> <h3><p>CGPA/Marks &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"corm\" value=\"cgpa\">CGPA <input type=\"text\" name=\"cgpa\" id=\"cgpa\">/<select name =\"total_cgpa\" id=\"total_cgpa\"><option value=\"4\">4</option><option value=\"10\">10</option></select></p> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"corm\" value=\"marks\">MARKS <input type=\"text\" name=\"marks\" id=\"marks\"> &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tcorm\"></span></p></h3> <input type=\"checkbox\" name=\"opt_checkbox\" value=\"check1\"> <h3> Are you applying for ECE PhD?</h3> <p> <h3>Preference 1*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_pref1\"><option value=\"Advanced Signal Processing\" selected=\"selected\">Advanced Signal Processing</option><option value=\"Statistical Signal Processing\">Statistical Signal Processing</option><option value=\"Digital VLSI Design\">Digital VLSI Design</option><option value=\"Analog CMOS design\">Analog CMOS design</option><option value=\"Digital Communications\">Digital Communications</option><option value=\"Communication Networks\">Communication Networks</option><option value=\"Linear systems\">Linear systems</option><option value=\"Introduction to Robotics\">Introduction to Robotics</option><option value=\"RF Circuit design\">RF Circuit design</option><option value=\"Antennas and Propagation\">Antennas and Propagation</option><option value=\"Embedded Systems\">Embedded Systems</option></select> </p> <p> <h3>Preference 2*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_pref2\"><option value=\"Advanced Signal Processing\" selected=\"selected\">Advanced Signal Processing</option><option value=\"Statistical Signal Processing\">Statistical Signal Processing</option><option value=\"Digital VLSI Design\">Digital VLSI Design</option><option value=\"Analog CMOS design\">Analog CMOS design</option><option value=\"Digital Communications\">Digital Communications</option><option value=\"Communication Networks\">Communication Networks</option><option value=\"Linear systems\">Linear systems</option><option value=\"Introduction to Robotics\">Introduction to Robotics</option><option value=\"RF Circuit design\">RF Circuit design</option><option value=\"Antennas and Propagation\">Antennas and Propagation</option><option value=\"Embedded Systems\">Embedded Systems</option></select> </p> <p> <h3>Preference 3*</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_pref3\"><option value=\"Advanced Signal Processing\" selected=\"selected\">Advanced Signal Processing</option><option value=\"Statistical Signal Processing\">Statistical Signal Processing</option><option value=\"Digital VLSI Design\">Digital VLSI Design</option><option value=\"Analog CMOS design\">Analog CMOS design</option><option value=\"Digital Communications\">Digital Communications</option><option value=\"Communication Networks\">Communication Networks</option><option value=\"Linear systems\">Linear systems</option><option value=\"Introduction to Robotics\">Introduction to Robotics</option><option value=\"RF Circuit design\">RF Circuit design</option><option value=\"Antennas and Propagation\">Antennas and Propagation</option><option value=\"Embedded Systems\">Embedded Systems</option></select> </p> <p> <h3>Preference 4</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_pref4\"><option value=\"Advanced Signal Processing\" selected=\"selected\">Advanced Signal Processing</option><option value=\"Statistical Signal Processing\">Statistical Signal Processing</option><option value=\"Digital VLSI Design\">Digital VLSI Design</option><option value=\"Analog CMOS design\">Analog CMOS design</option><option value=\"Digital Communications\">Digital Communications</option><option value=\"Communication Networks\">Communication Networks</option><option value=\"Linear systems\">Linear systems</option><option value=\"Introduction to Robotics\">Introduction to Robotics</option><option value=\"RF Circuit design\">RF Circuit design</option><option value=\"Antennas and Propagation\">Antennas and Propagation</option><option value=\"Embedded Systems\">Embedded Systems</option></select> </p> <h3><input type=\"checkbox\" name=\"opt_checkbox\" value=\"check2\">Have you completed your Post Graduation?</h3> <h3><p>Name of College &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"pg_college\"></p></h3> <h3><p>City &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"pg_city\"></p></h3> <h3><p>State &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_state\"><<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option><option value=\"Andhra Pradesh\">Andhra Pradesh</option><option value=\"Arunachal Pradesh\">Arunachal Pradesh</option><option value=\"Assam\">Assam</option><option value=\"Bihar\">Bihar</option><option value=\"Chandigarh\">Chandigarh</option><option value=\"Chhatisgarh\">Chhatisgarh</option><option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option><option value=\"Daman and Diu\">Daman and Diu</option><option value=\"Delhi\" selected=\"selected\">Delhi</option><option value=\"Goa\">Goa</option><option value=\"Gujarat\">Gujarat</option><option value=\"Haryana\">Haryana</option><option value=\"Himachal Pradesh\">Himachal Pradesh</option><option value=\"Jammu and Kashmir\">Jammu and Kashmir</option><option value=\"Jharkhand\">Jharkhand</option><option value=\"Karnataka\">Karnataka</option><option value=\"Kerala\">Kerala</option><option value=\"Lakshadweep\">Lakshadweep</option><option value=\"Madhya Pradesh\">Madhya Pradesh</option><option value=\"Maharashtra\">Maharashtra</option><option value=\"Manipur\">Manipur</option><option value=\"Meghalaya\">Meghalaya</option><option value=\"Mizoram\">Mizoram</option><option value=\"Nagaland\">Nagaland</option><option value=\"Orissa\">Orissa</option><option value=\"Pondicherry\">Pondicherry</option><option value=\"Punjab\">Punjab</option><option value=\"Rajasthan\">Rajasthan</option><option value=\"Sikkim\">Sikkim</option><option value=\"Tamil Nadu\">Tamil Nadu</option><option value=\"Tripura\">Tripura</option><option value=\"Uttaranchal\">Uttaranchal</option><option value=\"Uttar Pradesh\">Uttar Pradesh</option><option value=\"West Bengal\">West Bengal</option><option value=\"Other\">Other</option></select></p> <h3><p>Department/Discipline &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"pg_department\"></p></h3> <h3><p>Degree &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"pg_degree\"></p></h3> <h3><p>Thesis Title &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"pg_thesis\"></p></h3> <h3><p>Year of Post-Graduation* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"pg_year\"><option value=\"\" selected=\"selected\">---------</option><option value=\"2015\" selected=\"selected\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select></p> </p></h3> <h3><p>CGPA/Marks &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"pg_corm\" value=\"CGPA\">CGPA <input type=\"text\" name=\"pg_cgpa\">/<select id=\"pg_totcgpa\"><option value=\"4\">4</option><option value=\"10\">10</option></select></p> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"pg_corm\" value=\"MARKS\">MARKS <input type=\"text\" name=\"pg_marks\"></p></h3> <h3> <input type=\"checkbox\" name=\"opt_checkbox\" value=\"check3\"> Other Academic Degrees?</h3> <h3><p>Exam &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"other_exam\"></p><h3> <h3><p>Subject &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"other_subject\"></p><h3> <h3><p> Year* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"other_year\"><option value=\"\" selected=\"selected\">---------</option><option value=\"2015\" selected=\"selected\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select></p> <h3><p> Score &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"other_score\"></p><h3> <h3><p> Rank &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"other_rank\"></p><h3> <h3><input type=\"checkbox\" name=\"opt_checkbox\" value=\"check4\">Taken GATE Exam?</h3> <h3><p>Area &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"gate_area\"></p></h3> <h3><p>Year of Graduation* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select id=\"gate_year\"><option value=\"\" selected=\"selected\">---------</option><option value=\"2015\" selected=\"selected\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\">2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option></select> </h3></p> <h3><p>Marks(Out Of 100) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"gate_marks\"></p></h3> <h3><p>Score &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"gate_score\"></p></h3> <h3><p>Rank &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"gate_rank\"></p></h3> <br> <p><h3>Achievements &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"achievements\"></h3></p> <h3><p>CV/Resume* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"file\" name=\"upload_cv\" value=\"UPLOAD CV\">Upload a file upto 10 MB</p><h3> <h3><p>Statement of Purpose* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"file\" name=\"upload_sop\" value=\"UPLOAD SOP\">Upload a file upto 10 MB</p><h3> <br> <center><button type=\"button\" onclick=\"func()\">Submit Application</button></center> <input type=\"submit\" name=\"Submit\" id=\"Submit\" style=\"display:none;\"> </div></form></body> <script> function func(){ var txt;var check; var field;var flag=0; field=\"XBoard\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"XIIBoard\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"degree\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"dept\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"college\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"university\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"city\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"XMarks\"; txt=document.getElementById(field).value; if(txt.length==0|| isNaN(txt) || txt>100 || txt<0 ){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"XIIMarks\";flag=0; txt=document.getElementById(field).value; if(txt.length==0|| isNaN(txt) || txt>100 || txt<0 ){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"corm\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Choose CGPA or Marks\" ;flag=1;} else { if(check==0 && document.getElementById(\"total_cgpa\").options[document.getElementById(\"total_cgpa\").selectedIndex].value==4){ field=\"cgpa\"; txt=document.getElementById(field).value; if(txt.length==0|| isNaN(txt) || txt>4 || txt<0 ){ document.getElementById(\"tcorm\").innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"tcorm\").innerHTML = \"\" ; } if(check==0 && document.getElementById(\"total_cgpa\").options[document.getElementById(\"total_cgpa\").selectedIndex].value==10){ field=\"cgpa\"; txt=document.getElementById(field).value; if(txt.length==0|| isNaN(txt) || txt>10 || txt<0 ){ document.getElementById(\"tcorm\").innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"tcorm\").innerHTML = \"\" ; } if(check==1){ field=\"marks\"; txt=document.getElementById(field).value; if(txt.length==0|| isNaN(txt) || txt>100 || txt<0 ){ document.getElementById(\"tcorm\").innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"tcorm\").innerHTML = \"\" ; } } if(flag==0) document.getElementById(\"Submit\").click(); } </script> </html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Form2");
		generateNew(request,response);
		
	}

}
