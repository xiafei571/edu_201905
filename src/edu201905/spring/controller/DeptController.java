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

import edu201905.common.page.PaginationResult;
import edu201905.spring.domain.DeptInfo;
import edu201905.spring.service.DeptService;
import edu201905.util.Const;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String deptList(HttpServletRequest request, ModelMap model, Integer pageIndex, Integer pageSize) {
		// List<DeptInfo> result = deptService.getDeptList();
		PaginationResult<List<DeptInfo>> result = deptService.getDeptList(pageIndex, pageSize);
		model.addAttribute("result", result);
		return "dept";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addDept(ModelMap model) {
		model.addAttribute("dept", new DeptInfo());
		model.addAttribute("status", Const.FormStatus.ADD);
		return "dept_form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDept(@ModelAttribute("dept") DeptInfo dept, HttpServletRequest request, ModelMap model,
			Integer pageIndex, Integer pageSize) {
		deptService.addDept(dept);
		return "redirect:/dept/list";
	}

	// 跳转到修改信息页面
	// 访问方法: http://localhost:8080/~/1001/update
	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String update(@PathVariable Integer id, Model model) { // @PathVariable: 路径里面的值作为参数
		DeptInfo dept = deptService.getDeptInfoById(id);
		model.addAttribute("dept", dept);
		model.addAttribute("status", Const.FormStatus.UPDATE);
		return "dept_form";
	}

	// 具体的修改用户处理方法(post请求)
	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String update(@PathVariable Integer id, @Validated DeptInfo dept) {
		deptService.updateDept(dept);
		return "redirect:/dept/list";
	}

	// 删除用户信息
	// 访问方法: http://localhost:8080/~/1001/delete
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable Integer id) {
		deptService.deleteDept(id);
		return "redirect:/dept/list";
	}
}
