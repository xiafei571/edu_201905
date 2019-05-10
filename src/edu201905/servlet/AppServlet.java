package edu201905.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import edu201905.spring.service.DeptService;

public class AppServlet implements Servlet {

	@Autowired
	private DeptService deptService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// servlet用@Autowired
		// 注入service参数，会报空指针，注入的bean找不到。这是因为我们的bean都是归spring容器管理的，但是servlet单独有一个容器，归tomcat管理，所以这样注入是有问题的。需要做以下操作
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		req.setAttribute("result", deptService.getDeptList());
		req.getRequestDispatcher("/jsp/dept.jsp").forward(req, res);
		;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {

	}
}