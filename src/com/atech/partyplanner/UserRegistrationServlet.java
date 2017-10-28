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
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistrationServlet() {
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
		String name = (String) request.getParameter("NameUser");
		String password = (String) request.getParameter("NamePassword");
		String confirmPassword = (String) request.getParameter("NameConfirmPassword");
		String gender = (String) request.getParameter("NameGender");
		String dob = (String) request.getParameter("NameDob");
		String address = (String) request.getParameter("NameAddress");
		String phoneNumber = (String) request.getParameter("NamePhoneNumber");
		String email = (String) request.getParameter("NameEmail");
		
		UserRegistrationService user = new UserRegistrationService();
		user.userRegistration(name, password, confirmPassword, gender, dob, address, phoneNumber, email);
				
		RequestDispatcher rd = request.getRequestDispatcher("PartyPlanner_Login.jsp");
		rd.forward(request, response);
	}

}
