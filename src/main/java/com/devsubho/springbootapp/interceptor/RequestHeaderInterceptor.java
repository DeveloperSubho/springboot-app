package com.devsubho.springbootapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devsubho.springbootapp.exception.InvalidHeaderFieldException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class RequestHeaderInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub

		// un-comment to use the interceptor with a requestHeader
		 if (StringUtils.isBlank(request.getHeader("student-auth-key"))) {
		 	throw new InvalidHeaderFieldException("Invalid request");
		 }
		return super.preHandle(request, response, handler);
	}
}
