package com.awr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awr.dao.UserDAO;

/**
 * Servlet implementation class ValidateUser
 */
@WebServlet("/validate.do")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    /*public ValidateUser() {
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		if(new UserDAO().validateUser(uname,pass))
		{
			request.getRequestDispatcher("success.jsp").forward(request,response);
		}
		else
		{
			request.getRequestDispatcher("fail.jsp").forward(request,response);
		}
	}

}
