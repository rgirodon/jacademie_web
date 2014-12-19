package org.jacademie.tdweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HelloAnnotServlet
 */
@WebServlet(name="LogoutServlet", urlPatterns="/LogoutServlet")
public class LogoutServlet extends HttpServlet {
       
	private static Logger logger = Logger.getLogger(LogoutServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("In LogoutServlet");
		
		request.getSession().invalidate();
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/logout.jsp");
		dispatcher.forward(request, response);
	}


}
