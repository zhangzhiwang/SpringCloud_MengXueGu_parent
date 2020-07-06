package com.asiainfo.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component// 一定要标识本过滤器是一个bean
public class LoginFilter extends ZuulFilter {

	/**
	 * 是否过滤
	 */
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * 过滤的逻辑
	 */
	@Override
	public Object run() throws ZuulException {
		RequestContext requestContext = RequestContext.getCurrentContext();// 注意这里的RequestContext是com.netflix.zuul.context.RequestContext，不是别的包下的
		HttpServletRequest httpServletRequest = requestContext.getRequest();
		String parameter = httpServletRequest.getParameter("token");
		if(StringUtils.isEmpty(parameter)) {// 没有登陆
			System.out.println("没有登陆！");
			requestContext.setSendZuulResponse(false);// 拒绝访问
			requestContext.setResponseStatusCode(200);// 响应状态码
			try {
				requestContext.getResponse().getWriter().write("Not logged-in!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
		
		System.out.println("校验通过，允许转发");
		return null;
	}

	/**
	 * 过滤起的类型：
	 * pre-过滤之前执行
	 * route-过滤的时候执行
	 * post-过滤之后执行
	 * error-过滤报错的时候执行
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	/**
	 * 过滤器执行的顺序
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
