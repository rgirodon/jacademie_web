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
@WebServlet(name="HelloMvcServlet", urlPatterns="/HelloMvcServlet")
public class HelloMvcServlet extends HttpServlet {
       
	private static Logger logger = Logger.getLogger(HelloMvcServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloMvcServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("In HelloMvcServlet");
		
		String name = request.getParameter("name");
		if (name == null) {
			name = "World";
		}
		
		request.setAttribute("userName", name);		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/helloMvc.jsp");
		dispatcher.forward(request, response);
	}


}
