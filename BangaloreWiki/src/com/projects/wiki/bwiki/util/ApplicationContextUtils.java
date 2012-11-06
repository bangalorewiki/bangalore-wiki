package com.projects.wiki.bwiki.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtils implements ApplicationContextAware {

	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		ctx = appContext;
		System.out.println("Setting the context "+ctx);
		
	}

	public static ApplicationContext getApplicationContext() {
		System.out.println("returning "+ctx);
		return ctx;
	}
}