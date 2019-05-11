package edu201905.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu201905.spring.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	
	
}
