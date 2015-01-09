package org.jacademie.tdweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jacademie.tdweb.business.PriceCalculator;
import org.jacademie.tdweb.domain.Livre;

/**
 * Servlet implementation class HelloAnnotServlet
 */
@WebServlet(name="LivreServlet", urlPatterns="/LivreServlet")
public class LivreServlet extends HttpServlet {
       
	private static Logger logger = Logger.getLogger(LivreServlet.class);
	
	@Inject
	private PriceCalculator priceCalculator;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivreServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("In LivreServlet");
		
		Collection<Livre> livres = new ArrayList<Livre>();
		
		Livre livre1 = new Livre("Les miserables", "Victor Hugo");
		livres.add(livre1);
		
		Livre livre2 = new Livre("L'ecume des jours", "Boris Vian");
		livres.add(livre2);
		
		Livre livre3 = new Livre("Les confessions", "Jean-Jacques Rousseau");
		livres.add(livre3);
		
		request.setAttribute("livres", livres);
		
		Double price = 100.0D;
		
		logger.info("Price TTC = " + this.priceCalculator.calculateTTCPrice(price));
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/livres.jsp");
		dispatcher.forward(request, response);
	}


}
