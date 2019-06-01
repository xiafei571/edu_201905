package edu201905.spring.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu201905.spring.domain.StudentInfo;
import edu201905.spring.model.mapper.StudentMapper;
import edu201905.spring.service.StudentService;

@Component("studentService")
public class StudentServicelmpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<StudentInfo> getStudentList() {
		return studentMapper.getStudentInfoList();

	}

	@Override
	public Integer addStudent(StudentInfo student) {
		return studentMapper.addStudent(student);
	}

	@Override
	public Integer updateStudent(StudentInfo student) {
		return studentMapper.updateStudent(student);
	}

	@Override
	public Integer deleteStudent(Integer id) {
		return studentMapper.deleteStudent(id);
	}

	@Override
	public StudentInfo getStudentById(Integer id) {
		return studentMapper.getStudentById(id);
	}

	@Override
	public List<Map<String, Object>> getStudentGroupByLoc() {
		return studentMapper.getStudentGroupByLoc();
	}
}
