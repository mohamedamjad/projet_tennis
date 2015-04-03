package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Adherent;

/**
 * Servlet implementation class InscriptionAdherent
 */
public class InscriptionAdherent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionAdherent() {
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
		
		PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(login==null || password==null){
			out.println("<h1>Champs Login et Password obligatoires !</h1>");
			out.println("<a href=\"html/login.html\">Recommencer</a>");
		}else{
			out.println("Inscription OK");
		}
		
		
		out.println("<h1>OK</h1>");
		/*String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String login = request.getP
		Adherent adherent = new Adherent(nom, prenom, telephone, adresse, password, login);*/
	}

}
