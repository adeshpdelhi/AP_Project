

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form1
 */
@WebServlet("/Form1")
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1() {
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
		out.println(" <head><style> h3 { display: inline; } input { display: inline-block;} </style> <link rel=\"stylesheet\" type=\"text/css\" href=\"style_menu.css\"> </head> <div id=\"form1\"> <form action=\"Form1_submit\" method=\"POST\"> <center><h1>Personal Information</h1></center> <p><h3><u>Enter the required fields</u></h3></p> <br><br> <p><h3>EMAIL</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"email\" name=\"email\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"temail\"></span></p> <p><h3>NAME</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"name\" name=\"name\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tname\"></span></p> <p><h3>ENROLLMENT NO</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"enrollno\" name=\"enrollno\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tenrollno\"></span></p> <p><h3>ADDRESS OF CORRESPONDENCE</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"corr_address\" name=\"corr_address\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tcorr_address\"></span></p> <p><h3>MOBILE</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"mobile\" name=\"mobile\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tmobile\"></span></p> <p><h3>PhD STREAM</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"phd\" id=\"phd\" value=\"Computer Science\">Computer Science&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"phd\" id=\"phd\" value=\"Electronics and Commmunication Engineering\">Electronics and Commmunication Engineering&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"phd\" id=\"phd\" value=\"Commutational Biology\">Commutational Biology &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tphd\"></span></p> <p><h3>Phd Preference Area 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3> <select name=\"phd1\" id=\"phd1\"> <option value=\"Artificial Intelligence and Robotics - CSE\" selected=\"selected\">Artificial Intelligence and Robotics - CSE</option> <option value=\"Biophysics - CB\">Biophysics - CB</option> <option value=\"Compilers - CSE\">Compilers - CSE</option> <option value=\"Computer Architecture and Systems Design - ECE\">Computer Architecture and Systems Design - ECE</option> </select> </p> <p><h3>Phd Preference Area 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3> <select name=\"phd2\" id=\"phd2\"> <option value=\"Artificial Intelligence and Robotics - CSE\" selected=\"selected\">Artificial Intelligence and Robotics - CSE</option> <option value=\"Biophysics - CB\">Biophysics - CB</option> <option value=\"Compilers - CSE\">Compilers - CSE</option> <option value=\"Computer Architecture and Systems Design - ECE\">Computer Architecture and Systems Design - ECE</option> </select></p> <p><h3>Phd Preference Area 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3> <select name=\"phd3\" id=\"phd3\"> <option value=\"Artificial Intelligence and Robotics - CSE\" selected=\"selected\">Artificial Intelligence and Robotics - CSE</option> <option value=\"Biophysics - CB\">Biophysics - CB</option> <option value=\"Compilers - CSE\">Compilers - CSE</option> <option value=\"Computer Architecture and Systems Design - ECE\">Computer Architecture and Systems Design - ECE</option> </select> </p> <p><h3>Gender</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"gender\" id=\"gender\" value=\"Male\">Male<input type=\"radio\" name=\"gender\" id=\"gender\" value=\"Female\">Female &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tgender\"></span></p> <p><h3>Category</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"category\" id=\"category\" value=\"General\">General<input type=\"radio\" name=\"category\" id=\"category\" value=\"SC\">SC<input type=\"radio\" name=\"category\" id=\"category\" value=\"ST\">ST<input type=\"radio\" name=\"category\" id=\"category\" value=\"OBC\">OBC &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tcategory\"></span></p> <p><h3>Physically Disabled</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"phydis\" id=\"phydis\" value=\"Yes\">Yes<input type=\"radio\" name=\"phydis\" id=\"phydis\" value=\"No\">No &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tphydis\"></span></p><p><h3>Date Of Birth</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"date\" id=\"dob\" name=\"dob\" max=\"2015-12-02\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tdob\"></span></p> <p><h3>Children/War Widows of Defence Personnel killed/Disabled in Action</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"defence\" id=\"defence\" value=\"Yes\">Yes<input type=\"radio\" name=\"defence\" id=\"defence\" value=\"No\">No &nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tdefence\"></span></p><p><h3>Father's Name</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"father\" name=\"father\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tfather\"></span></p> <p><h3>Nationality&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3> <select name=\"nationality\" id=\"nationality\"> <option value=\"afghan\">Afghan</option><option value=\"albanian\">Albanian</option><option value=\"algerian\">Algerian</option><option value=\"american\">American</option><option value=\"andorran\">Andorran</option><option value=\"angolan\">Angolan</option><option value=\"antiguans\">Antiguans</option><option value=\"argentinean\">Argentinean</option><option value=\"armenian\">Armenian</option><option value=\"australian\">Australian</option><option value=\"austrian\">Austrian</option><option value=\"azerbaijani\">Azerbaijani</option><option value=\"bahamian\">Bahamian</option><option value=\"bahraini\">Bahraini</option><option value=\"bangladeshi\">Bangladeshi</option><option value=\"barbadian\">Barbadian</option><option value=\"barbudans\">Barbudans</option><option value=\"batswana\">Batswana</option><option value=\"belarusian\">Belarusian</option><option value=\"belgian\">Belgian</option><option value=\"belizean\">Belizean</option><option value=\"beninese\">Beninese</option><option value=\"bhutanese\">Bhutanese</option><option value=\"bolivian\">Bolivian</option><option value=\"bosnian\">Bosnian</option><option value=\"brazilian\">Brazilian</option><option value=\"british\">British</option><option value=\"bruneian\">Bruneian</option><option value=\"bulgarian\">Bulgarian</option><option value=\"burkinabe\">Burkinabe</option><option value=\"burmese\">Burmese</option><option value=\"burundian\">Burundian</option><option value=\"cambodian\">Cambodian</option><option value=\"cameroonian\">Cameroonian</option><option value=\"canadian\">Canadian</option><option value=\"cape verdean\">Cape Verdean</option><option value=\"central african\">Central African</option><option value=\"chadian\">Chadian</option><option value=\"chilean\">Chilean</option><option value=\"chinese\">Chinese</option><option value=\"colombian\">Colombian</option><option value=\"comoran\">Comoran</option><option value=\"congolese\">Congolese</option><option value=\"costa rican\">Costa Rican</option><option value=\"croatian\">Croatian</option><option value=\"cuban\">Cuban</option><option value=\"cypriot\">Cypriot</option><option value=\"czech\">Czech</option><option value=\"danish\">Danish</option><option value=\"djibouti\">Djibouti</option><option value=\"dominican\">Dominican</option><option value=\"dutch\">Dutch</option><option value=\"east timorese\">East Timorese</option><option value=\"ecuadorean\">Ecuadorean</option><option value=\"egyptian\">Egyptian</option><option value=\"emirian\">Emirian</option><option value=\"equatorial guinean\">Equatorial Guinean</option><option value=\"eritrean\">Eritrean</option><option value=\"estonian\">Estonian</option><option value=\"ethiopian\">Ethiopian</option><option value=\"fijian\">Fijian</option><option value=\"filipino\">Filipino</option><option value=\"finnish\">Finnish</option><option value=\"french\">French</option><option value=\"gabonese\">Gabonese</option><option value=\"gambian\">Gambian</option><option value=\"georgian\">Georgian</option><option value=\"german\">German</option><option value=\"ghanaian\">Ghanaian</option><option value=\"greek\">Greek</option><option value=\"grenadian\">Grenadian</option><option value=\"guatemalan\">Guatemalan</option><option value=\"guinea-bissauan\">Guinea-Bissauan</option><option value=\"guinean\">Guinean</option><option value=\"guyanese\">Guyanese</option><option value=\"haitian\">Haitian</option><option value=\"herzegovinian\">Herzegovinian</option><option value=\"honduran\">Honduran</option><option value=\"hungarian\">Hungarian</option><option value=\"icelander\">Icelander</option><option value=\"indian\" selected=\"selected\">Indian</option><option value=\"indonesian\">Indonesian</option><option value=\"iranian\">Iranian</option><option value=\"iraqi\">Iraqi</option><option value=\"irish\">Irish</option><option value=\"israeli\">Israeli</option><option value=\"italian\">Italian</option><option value=\"ivorian\">Ivorian</option><option value=\"jamaican\">Jamaican</option><option value=\"japanese\">Japanese</option><option value=\"jordanian\">Jordanian</option><option value=\"kazakhstani\">Kazakhstani</option><option value=\"kenyan\">Kenyan</option><option value=\"kittian and nevisian\">Kittian and Nevisian</option><option value=\"kuwaiti\">Kuwaiti</option><option value=\"kyrgyz\">Kyrgyz</option><option value=\"laotian\">Laotian</option><option value=\"latvian\">Latvian</option><option value=\"lebanese\">Lebanese</option><option value=\"liberian\">Liberian</option><option value=\"libyan\">Libyan</option><option value=\"liechtensteiner\">Liechtensteiner</option><option value=\"lithuanian\">Lithuanian</option><option value=\"luxembourger\">Luxembourger</option><option value=\"macedonian\">Macedonian</option><option value=\"malagasy\">Malagasy</option><option value=\"malawian\">Malawian</option><option value=\"malaysian\">Malaysian</option><option value=\"maldivan\">Maldivan</option><option value=\"malian\">Malian</option><option value=\"maltese\">Maltese</option><option value=\"marshallese\">Marshallese</option><option value=\"mauritanian\">Mauritanian</option><option value=\"mauritian\">Mauritian</option><option value=\"mexican\">Mexican</option><option value=\"micronesian\">Micronesian</option><option value=\"moldovan\">Moldovan</option><option value=\"monacan\">Monacan</option><option value=\"mongolian\">Mongolian</option><option value=\"moroccan\">Moroccan</option><option value=\"mosotho\">Mosotho</option><option value=\"motswana\">Motswana</option><option value=\"mozambican\">Mozambican</option><option value=\"namibian\">Namibian</option><option value=\"nauruan\">Nauruan</option><option value=\"nepalese\">Nepalese</option><option value=\"new zealander\">New Zealander</option><option value=\"ni-vanuatu\">Ni-Vanuatu</option><option value=\"nicaraguan\">Nicaraguan</option><option value=\"nigerien\">Nigerien</option><option value=\"north korean\">North Korean</option><option value=\"northern irish\">Northern Irish</option><option value=\"norwegian\">Norwegian</option><option value=\"omani\">Omani</option><option value=\"pakistani\">Pakistani</option><option value=\"palauan\">Palauan</option><option value=\"panamanian\">Panamanian</option><option value=\"papua new guinean\">Papua New Guinean</option><option value=\"paraguayan\">Paraguayan</option><option value=\"peruvian\">Peruvian</option><option value=\"polish\">Polish</option><option value=\"portuguese\">Portuguese</option><option value=\"qatari\">Qatari</option><option value=\"romanian\">Romanian</option><option value=\"russian\">Russian</option><option value=\"rwandan\">Rwandan</option><option value=\"saint lucian\">Saint Lucian</option><option value=\"salvadoran\">Salvadoran</option><option value=\"samoan\">Samoan</option><option value=\"san marinese\">San Marinese</option><option value=\"sao tomean\">Sao Tomean</option><option value=\"saudi\">Saudi</option><option value=\"scottish\">Scottish</option><option value=\"senegalese\">Senegalese</option><option value=\"serbian\">Serbian</option><option value=\"seychellois\">Seychellois</option><option value=\"sierra leonean\">Sierra Leonean</option><option value=\"singaporean\">Singaporean</option><option value=\"slovakian\">Slovakian</option><option value=\"slovenian\">Slovenian</option><option value=\"solomon islander\">Solomon Islander</option><option value=\"somali\">Somali</option><option value=\"south african\">South African</option><option value=\"south korean\">South Korean</option><option value=\"spanish\">Spanish</option><option value=\"sri lankan\">Sri Lankan</option><option value=\"sudanese\">Sudanese</option><option value=\"surinamer\">Surinamer</option><option value=\"swazi\">Swazi</option><option value=\"swedish\">Swedish</option><option value=\"swiss\">Swiss</option><option value=\"syrian\">Syrian</option><option value=\"taiwanese\">Taiwanese</option><option value=\"tajik\">Tajik</option><option value=\"tanzanian\">Tanzanian</option><option value=\"thai\">Thai</option><option value=\"togolese\">Togolese</option><option value=\"tongan\">Tongan</option><option value=\"trinidadian or tobagonian\">Trinidadian or Tobagonian</option><option value=\"tunisian\">Tunisian</option><option value=\"turkish\">Turkish</option><option value=\"tuvaluan\">Tuvaluan</option><option value=\"ugandan\">Ugandan</option><option value=\"ukrainian\">Ukrainian</option><option value=\"uruguayan\">Uruguayan</option><option value=\"uzbekistani\">Uzbekistani</option><option value=\"venezuelan\">Venezuelan</option><option value=\"vietnamese\">Vietnamese</option><option value=\"welsh\">Welsh</option><option value=\"yemenite\">Yemenite</option><option value=\"zambian\">Zambian</option><option value=\"zimbabwean\">Zimbabwean</option></select> </p> <p><h3>Permanent Address</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"perm_address\" name=\"perm_address\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tperm_address\"></span></p> <p><h3>Pin Code</h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" id=\"pin\" name=\"pin\">&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"tpin\"></span></p> <br> <center><button type=\"button\" onclick=\"func()\">Save and Proceed</center></button> <input type=\"submit\" name=\"Submit\" id=\"Submit\" style=\"display:none;\"> </form> </center> </div> <script> function func(){ var txt;var check; var field=\"email\";var flag=0; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"name\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"enrollno\"; txt=document.getElementById(field).value; if(isNaN(txt) || txt < 1 || txt > 100000){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"corr_address\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"mobile\"; txt=document.getElementById(field).value; if(isNaN(txt) || txt < 1000000000 || txt > 10000000000){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"father\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"perm_address\"; txt=document.getElementById(field).value; if(txt.length==0){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"pin\"; txt=document.getElementById(field).value; if(isNaN(txt) || txt < 100000 || txt > 1000000){ document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1; } else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"phd\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"gender\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"category\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"phydis\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"defence\"; txt = document.getElementsByName(field); check = -1; for(var i=0; i < txt.length; i++){ if(txt[i].checked) { check = i; } } if (check == -1) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; field=\"dob\"; txt = document.getElementById(field); if (txt.length==0) { document.getElementById(\"t\"+field).innerHTML = \"Invalid\" ;flag=1;} else document.getElementById(\"t\"+field).innerHTML = \"\" ; if(flag==0) document.getElementById(\"Submit\").click(); } </script>");
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		generateNew(request,response);
	}

}
