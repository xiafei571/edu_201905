package edu201905.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.LoginInfo;
import edu201905.spring.domain.UserInfo;
import edu201905.spring.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap modelMap) {
		modelMap.put("user", new LoginInfo());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginInfo user, HttpSession session, ModelMap modelMap) {

		if (userService.loginValid(user, session)) {
			return "redirect:index";
		}
		user.setPassword(null);
		modelMap.put("msg", "账号或密码错误");
		modelMap.put("user", user);
		return "login";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap, HttpSession session) {
		LoginInfo loginUser = (LoginInfo) session.getAttribute("USER_SESSION");
		String msg = "未登录";
		if (null != loginUser)
			msg = "欢迎：" + loginUser.getUsername();
		modelMap.put("msg", msg);
		return "index";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		// 清除session
		session.invalidate();
		// 重定向到登录页面的跳转方法
		return "redirect:login";
	}
}
