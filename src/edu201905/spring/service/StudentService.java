package edu201905.spring.service;

import java.util.List;
import java.util.Map;

import edu201905.spring.domain.StudentInfo;

public interface StudentService {

	List<StudentInfo> getStudentList();

	Integer addStudent(StudentInfo student);

	Integer updateStudent(StudentInfo student);

	Integer deleteStudent(Integer id);

	StudentInfo getStudentById(Integer id);
	
	List<Map<String, Object>> getStudentGroupByLoc();

}
