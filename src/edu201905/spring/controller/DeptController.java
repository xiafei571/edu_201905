package edu201905.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.DeptInfo;
import edu201905.spring.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String deptList(HttpServletRequest request, ModelMap model) {
		List<DeptInfo> result = deptService.getDeptList();
		model.addAttribute("result", result);
		return "dept";
	}
}
