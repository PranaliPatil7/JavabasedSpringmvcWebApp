package com.prowings.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { SpringWebMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping= {"/"};
		return mapping;
	}
}
