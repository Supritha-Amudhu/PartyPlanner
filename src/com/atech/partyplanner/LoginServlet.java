package com.atech.partyplanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
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
		HttpSession session = request.getSession();
		String loginName = (String) request.getParameter("NameLogin");
		String password = (String) request.getParameter("NamePassword");
		session.setAttribute("sessionLoginName", loginName);
		System.out.println(loginName);
		LoginValidationService login = new LoginValidationService();
		String check = login.validateUser(loginName, password);
		if(check.equals("admin"))
		{
			session.setAttribute("sessionAdmin", loginName);
			RequestDispatcher rd = request.getRequestDispatcher("PartyPlanner_AdminHomePage.jsp");
			rd.forward(request, response);
		}
		else
		{
			UserHomePageService user = new UserHomePageService();
			session.setAttribute("partyDetails", user.getUserParties(loginName));			
			RequestDispatcher rd = request.getRequestDispatcher("PartyPlanner_UserHomePage.jsp");
			rd.forward(request, response);
		}
		System.out.println(check);
		
	}

}
