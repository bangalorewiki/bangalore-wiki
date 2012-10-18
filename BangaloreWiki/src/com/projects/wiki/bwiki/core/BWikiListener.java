/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */

package com.projects.wiki.bwiki.core;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BWikiListener implements ServletContextListener{
	
	private static final Logger logger = Logger.getLogger(BWikiListener.class.getName());
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("Context is getting destroyed!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("Initializing BWiki ...");
	}
}
