package com.septinary.xb.core.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Log4jListener implements ServletContextListener {

	public static final String log4jdirkey = "log4jdir";

	@Override
	public void contextDestroyed(ServletContextEvent servletcontextevent) {
		// TODO Auto-generated method stub
		System.getProperties().remove(log4jdirkey);
	}

	@Override
	public void contextInitialized(ServletContextEvent servletcontextevent) {
		// TODO Auto-generated method stub
		// String log4jdir =
		// servletcontextevent.getServletContext().getRealPath("/");
		// System.setProperty(log4jdirkey, log4jdir);
		String log4jdir = "catalina.base";
		if (System.getProperty(log4jdir) == null) {
			String root = servletcontextevent.getServletContext().getRealPath(
					"/");
			System.setProperty(log4jdir, root);
		}

	}
}
