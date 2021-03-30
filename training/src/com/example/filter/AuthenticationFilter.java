package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("===== Inside AuthenticationFilter init() =====");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		if(httpRequest.getRequestURI().endsWith("login.jsp")) {
			httpRequest.getRequestDispatcher("login.jsp").forward(request, response);				
		}
		
		if (httpRequest.getParameter("user") != null && httpRequest.getParameter("password") != null) {
			String user = httpRequest.getParameter("user");
			String password = httpRequest.getParameter("password");
			if(user.equals("ritesh") && password.equals("secret")) {
				filterChain.doFilter(request, response);				
			}else {
				httpResponse.sendRedirect("login.jsp");
			}

		} else {
			httpResponse.sendRedirect("login.jsp");
		}
	}

	@Override
	public void destroy() {
		System.out.println("===== Inside AuthenticationFilter destroy() =====");

	}

}
