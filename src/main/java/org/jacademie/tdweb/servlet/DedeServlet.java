package org.jacademie.tdweb.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class DedeServlet
 */
@WebServlet(name="DedeServlet", urlPatterns="/TestServlet")
public class DedeServlet extends HttpServlet {
       
	private static Logger logger = Logger.getLogger(DedeServlet.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DedeServlet() {
        super();
    }

    @Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		
		logger.info("Hello Test : init method ");
	}

	/**
     * doGet Method
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		logger.info("Hello Test : GET method ");
	}

	/**
	 * doPost Method
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		logger.info("Hello Test : POST method ");
	}
}
