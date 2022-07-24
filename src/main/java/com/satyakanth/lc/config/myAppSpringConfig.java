package com.satyakanth.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class myAppSpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {myApplicationConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]={"/mywebsite.com/*"};
		return arr;
	}

}
