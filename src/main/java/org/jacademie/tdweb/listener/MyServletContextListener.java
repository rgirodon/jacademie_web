package org.jacademie.tdweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

@WebListener
public class MyServletContextListener implements ServletContextListener {

	private static Logger logger = Logger.getLogger(MyServletContextListener.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent ctx) {
		logger.debug("Context destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent ctx) {
		logger.debug("Context initialized");
	}

	
}
