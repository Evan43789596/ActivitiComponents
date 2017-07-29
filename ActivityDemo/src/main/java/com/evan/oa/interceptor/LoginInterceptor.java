package com.evan.oa.interceptor;

import com.evan.oa.util.BeanUtils;
import com.evan.oa.entity.User;
import com.evan.oa.util.UserUtil;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		User user = UserUtil.getUserFromSession();
		if(!BeanUtils.isBlank(user)){
			return true;
		}
		response.sendRedirect(request.getContextPath() + "/userAction/login_view");
		return false;
	}

}
