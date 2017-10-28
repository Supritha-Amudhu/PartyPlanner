package com.atech.partyplanner;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PartyRegistrationServlet
 */
@WebServlet("/PartyRegistrationServlet")
public class PartyRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartyRegistrationServlet() {
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
		String partyName = (String) request.getParameter("NamePartyName");
		String music = (String) request.getParameter("NameMusic");
		String food = (String) request.getParameter("NameFood");
		String venue = (String) request.getParameter("NameVenue");
		String date = (String) request.getParameter("NameDate");
		String time = (String) request.getParameter("NameTime");
		String[] people = (String[]) request.getParameterValues("user");
		//System.out.println(people[0] + people[1]);
		PartyRegistrationService obj = new PartyRegistrationService();
		obj.PartyRegistration(partyName, music, food, venue, date, time, people);
		
		RequestDispatcher rd = request.getRequestDispatcher("PartyPlanner_AdminHomePage.jsp");
		rd.forward(request, response);
				
	}

}
