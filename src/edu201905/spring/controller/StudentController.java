package edu201905.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.StudentInfo;
import edu201905.spring.service.StudentService;
import edu201905.util.Const;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String studentList(HttpServletRequest request, ModelMap model) {
		List<StudentInfo> result = studentService.getStudentList();
		model.addAttribute("result", result);
		return "student";

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addStudent(ModelMap model) {
		System.out.println("1111111111111111111s");
		model.addAttribute("student", new StudentInfo());
		model.addAttribute("status", Const.FormStatus.ADD);
		return "student_form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") StudentInfo student, HttpServletRequest request, ModelMap model,
			Integer pageIndex, Integer pageSize) {
		studentService.addStudent(student);
		return "redirect:/student/list";
	}

}
