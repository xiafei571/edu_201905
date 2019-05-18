package edu201905.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.EmpInfo;
import edu201905.spring.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String empList(HttpServletRequest request, ModelMap model) {
		List<EmpInfo> result = empService.getEmpList();
		model.addAttribute("result", result);
		return "emp";

	}
}
