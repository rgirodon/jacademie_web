package org.jacademie.tdweb.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter(urlPatterns="/*")
public class LoggingFilter implements Filter {

	private static Logger logger = Logger.getLogger(LoggingFilter.class);
	
    /**
     * Default constructor. 
     */
    public LoggingFilter() {

    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		// place your code here
		logger.debug("In LoggingFilter : " + ((HttpServletRequest)request).getRequestURL());

		Date before = new Date();
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		Date after = new Date();
		
		logger.info("[PERF AUDIT] " + ((HttpServletRequest)request).getRequestURL() + " : " + (after.getTime() - before.getTime()) + "ms.");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
