package com.example.filter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RequestLoggingFilter implements Filter {

	FileWriter fileWriter = null;
	String path = "C:/hsbc-pune-workspace/training/logs/access.log";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("===== Inside RequestLoggingFilter init() =====");
		try {
			fileWriter = new FileWriter(path, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		StringBuffer message = new StringBuffer();
		message.append("\n=============== START ================\n");
		message.append(httpServletRequest.getRequestURI());
		message.append(" accesses from ");
		message.append(httpServletRequest.getRemoteHost());
		message.append(" IP address at ");
		message.append(LocalDateTime.now());
		message.append("\n=============== END ================\n");
		
		fileWriter.write(message.toString());
		fileWriter.flush();
		
		filterChain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("===== Inside RequestLoggingFilter destroy() =====");
		try {
			if (fileWriter != null)
				fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
