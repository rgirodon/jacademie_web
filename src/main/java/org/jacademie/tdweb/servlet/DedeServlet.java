package org.jacademie.tdweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DedeServlet
 */
public class DedeServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DedeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) 
								   throws ServletException, IOException {

		System.out.println("Hello Test !");
	}

}
