package edu201905.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.DeptInfo;
import edu201905.spring.domain.EmpInfo;
import edu201905.spring.service.EmpService;
import edu201905.util.Const;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String empList(HttpServletRequest request, ModelMap model) 
	{
		List<EmpInfo> result = empService.getEmpList();
		model.addAttribute("result", result);
		return "emp";

	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addEmp(ModelMap model) 
	{
		model.addAttribute("emp", new EmpInfo());
		model.addAttribute("status", Const.FormStatus.ADD);
		return "emp_form";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmp(@ModelAttribute("emp") EmpInfo emp, HttpServletRequest request, ModelMap model,
			Integer pageIndex, Integer pageSize) {
		empService.addEmp(emp);
		return "redirect:/emp/list";
	}

	
}
