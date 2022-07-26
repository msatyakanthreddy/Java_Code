package com.satyakanth.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


//This class is generated by manually for creating dispacherServlet
//but in this project i am using spring automatically generates the same class


public class MyApplicationInitializer// implements WebApplicationInitializer {
{
	public void onStartup(ServletContext servletContext) throws ServletException
	{
		AnnotationConfigWebApplicationContext weApplicationContext = new AnnotationConfigWebApplicationContext();
		weApplicationContext.register(myApplicationConfig.class);
		DispatcherServlet dispatherServlet = new DispatcherServlet(weApplicationContext);
		
		ServletRegistration.Dynamic mycustomDispatcherServlet= servletContext.addServlet("mydispatherServlet", dispatherServlet);
		mycustomDispatcherServlet.setLoadOnStartup(1);
		mycustomDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
