package edu201905.spring.service.impl;

import java.util.List;

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
}
