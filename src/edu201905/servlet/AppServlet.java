package edu201905.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import edu201905.spring.domain.DeptInfo;
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
		// 设置响应内容类型 解决乱码问题
		res.setContentType("text/html;charset=utf-8");
		List<DeptInfo> result = deptService.getDeptList();
		// 实际的逻辑是在这里
		PrintWriter out = res.getWriter();
		for (DeptInfo dept : result) {
			out.println("<h1>" + dept + "</h1>");
		}

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