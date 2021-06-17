package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HellospringWebApplicationInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses(){
		// Root Application Context 설정 클래스
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Web Application Context 설정 클래스
		return new Class<?>[] {};
	}

	@Override
	protected String[] getServletMappings() {
		// DispatcherServlet Mapping URL
		return null;
	}

}
