package com.one.two.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CommonInterceptor extends HandlerInterceptorAdapter {
	static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// view 랜더링 전
		logger.info("### proc Interceptor.postHandle...");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 컨트롤러 진입 직전
		logger.info("### proc Interceptor.preHandle...");
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// view 랜더링 후
		logger.info("### proc Interceptor.afterCompletion...");
	}
	
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 비동기 요청 시 postHandle / afterCompletion을 수행하지 않고 이 메서드를 수행함.
		logger.info("### proc Interceptor.afterConcurrentHandlingStarted...");
	}
}
