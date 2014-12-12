package org.jacademie.tdweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	
	private static Logger logger = Logger.getLogger(HelloServlet.class);
	
    /**
     * Default constructor. 
     */
    public HelloServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("In HelloServlet");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		pw.println("<HTML>");
		pw.println("<BODY>");
		
		String name = request.getParameter("name");
		if (name == null) {
			name = "World";
		}
		
		pw.println("Hello " + name);
		
		pw.println("</BODY>");
		pw.println("</HTML>");
	}
}
