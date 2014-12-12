package org.jacademie.tdweb.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DedeServlet
 */
@WebServlet(name="DedeServlet", urlPatterns="/TestServlet")
public class DedeServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DedeServlet() {
        super();
    }

    @Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		
		System.out.println("Hello Test : init method ");
	}

	/**
     * doGet Method
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		System.out.println("Hello Test : GET method ");
	}

	/**
	 * doPost Method
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		System.out.println("Hello Test : POST method ");
	}
}
