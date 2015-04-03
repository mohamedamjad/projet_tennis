package servlet;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ActionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		HttpSession session = request.getSession(false);
		
		if(session == null){
			if(action.equals("L")){
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/LoginServlet");
				dispatcher.forward(request, response);
				return;
			}else{
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/html/login.html");
				dispatcher.forward(request, response);
				return;
			}
		}else{
			if(action.equals("A")){
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdherentServlet");
				dispatcher.forward(request, response);
				return;
			}else if(action.equals("I")){
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/InscriptionServlet");
				dispatcher.forward(request, response);
				return;
				
			}else{
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/Menu.jsp");
				dispatcher.forward(request, response);
				return;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
